#HelloDBP script
echo "HelloDBP"
echo "Launching Command Central and supporting containers"
docker-compose run --rm init
docker-compose run --rm init sagcc list repository fixes -e GA_Fix_Repo -w 300
echo "Launching Command Central and supporting containers Done"
echo "Provisioning GA products and fixes"
if docker-compose run --rm test; then
  echo "docker-compose run --rm test executed successfully"
else
  echo "docker-compose run --rm test executed failed. Known issue with starting Terracotta, so starting it using CCE Cli"
  docker exec -i bpm_dev1_1 chmod -R 777 /opt/softwareag/TerracottaDB/server/SPM/bin
  docker exec -i bpm_cc_1 /opt/softwareag/CommandCentral/client/bin/sagcc exec lifecycle start dev1 TDBServer-default
fi
echo "Provisioning GA products and fixes Done"
echo "Configuring TDB server"
sh TerracottaDBConfigure.sh
echo "Configured TDB server"
echo "Copying assets to CC Docker container"
docker cp ./AssetDeploymentAssets/ bpm_cc_1:/opt/
echo "Copying assets to CC Docker container Done"
echo "Register assets to CC from GitHub"
docker exec -i bpm_cc_1 ant AddGitRepo -buildfile /opt/AssetDeploymentAssets/build.xml test -Dasset.repo=assets-HelloDBP
echo "Registed assets to CC from GitHub"
echo "Deploy assets to IS"
if docker exec -i bpm_cc_1 ant deployToCIIS -buildfile /opt/AssetDeploymentAssets/build.xml -Dasset.repo=assets-HelloDBP;then
        echo "Deployed assets to IS"
else
        echo "Failed to deploy IS assets"
echo "end"