echo "##################################HelloDBP##################################"
echo "***** Launching Command Central and supporting containers *****"
docker-compose run --rm init
docker-compose run --rm init sagcc list repository fixes -e GA_Fix_Repo -w 300
echo "*****Launching Command Central and supporting containers Done*****"

echo "*****Started tune-up Command Central and Platform Manager*****"
docker cp ./templates/cc-tuneup/ hellodbp_cc_1:/opt/
docker exec -i hellodbp_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec templates composite import -i /opt/cc-tuneup/template.yaml 
docker exec -i hellodbp_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec templates composite apply cc-tuneup
echo "*****Complated tune-up Command Central and Platform Manager*****"

echo "*****Provisioning GA products and fixes*****"
if docker-compose run --rm test; then
  echo "*****docker-compose run --rm test executed successfully*****"
else
  echo "*****docker-compose run --rm test executed failed.*****"
fi
echo "*****Provisioning GA products and fixes Done*****"


echo "*****Waiting for CCE to get initialized*****"
count=0
while [ $count -lt 600 ]
do
 sleep 1s
 count=`expr $count + 1`
echo -ne "."
done
echo "*****Waiting completed*****"


echo "*****Copying assets to CC Docker container*****"
docker cp ./AssetDeploymentAssets/ hellodbp_cc_1:/opt/
echo "*****Copying assets to CC Docker container Done*****"

echo "*****Starting TerracottaDB server*****"
  docker exec -i hellodbp_dev1_1 chmod -R 777 /opt/softwareag/TerracottaDB/server/SPM/bin
  docker exec -i hellodbp_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec lifecycle start dev1 TDBServer-default
echo "*****TerracottaDB server started*****"

echo "*****Configuring TDB server*****"
sh TerracottaDBConfigure.sh
echo "*****Configured TDB server*****"

echo "*****Starting MashZoneNG*****"
docker exec -i hellodbp_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec lifecycle start dev1 presto
echo "*****MashZoneNG server started*****"

echo "*****Stopping Event Data Store*****"
docker exec -i hellodbp_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec lifecycle stop dev2 CEL
echo "*****Event Data Store Stopped*****"

echo "*****Stopping APIGateway IS*****"
docker exec -i hellodbp_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec lifecycle stop dev2 OSGI-IS_default
echo "*****APIGateway IS stopped*****"

echo "Starting APIGateway IS"
docker exec -i hellodbp_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec lifecycle start dev2 OSGI-IS_default
echo "*****Started APIGateway IS*****"


echo "*****Register assets to CC from GitHub*****"
docker exec -i hellodbp_cc_1 ant AddGitRepo -buildfile /opt/AssetDeploymentAssets/build.xml test -Dasset.repo=assets-HelloDBP
echo "*****Registed assets to CC from GitHub*****"
echo "*****Deploy assets to IS*****"
if docker exec -i hellodbp_cc_1 ant deployToCIIS -buildfile /opt/AssetDeploymentAssets/build.xml -Dasset.repo=assets-HelloDBP; then
        echo "*****Deployed assets to IS*****"
else
        echo "*****Failed to deploy IS assets*****"
fi

echo "*****Deploy assets to DES*****"
if docker exec -i hellodbp_cc_1 ant deployToCIDES -buildfile /opt/AssetDeploymentAssets/build.xml -Dasset.repo=assets-HelloDBP; then
        echo "*****Deployed assets to DES*****"
else
        echo "*****Failed to deploy DES assets*****"
fi
echo "##################################end##################################"