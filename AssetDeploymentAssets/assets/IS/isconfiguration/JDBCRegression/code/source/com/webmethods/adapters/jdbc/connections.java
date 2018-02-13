package com.webmethods.adapters.jdbc;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2009-07-09 14:53:23 GMT+05:30
// -----( ON-HOST: VMMVADIVEL1.eur.ad.sag

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Properties;
import java.io.FileInputStream;
// --- <<IS-END-IMPORTS>> ---

public final class connections

{
	// ---( internal utility methods )---

	final static connections _instance = new connections();

	static connections _newInstance() { return new connections(); }

	static connections _cast(Object o) { return (connections)o; }

	// ---( server methods )---




	public static final void generateConnectionInput (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(generateConnectionInput)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required connectionAlias
		// [i] field:0:required packageName
		// [i] field:0:required adapterTypeName
		// [i] field:0:required connectionFactoryType
		// [i] field:0:required transactionType
		// [i] field:0:required datasourceClass
		// [i] field:0:required serverName
		// [i] field:0:required user
		// [i] field:0:required password
		// [i] field:0:required databaseName
		// [i] field:0:required portNumber
		// [i] field:0:required networkProtocol
		// [i] field:0:required otherProperties
		// [o] field:0:required connectionAlias
		// [o] field:0:required packageName
		// [o] field:0:required adapterTypeName
		// [o] field:0:required connectionFactoryType
		// [o] record:0:required connectionSettings
		// [o] - field:0:required transactionType
		// [o] - field:0:required datasourceClass
		// [o] - field:0:required serverName
		// [o] - field:0:required user
		// [o] - field:0:required password
		// [o] - field:0:required databaseName
		// [o] - field:0:required portNumber
		// [o] - field:0:required networkProtocol
		// [o] - field:0:required otherProperties
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		IData T_row;
		String connectionAlias = IDataUtil.get(pipelineCursor,"connectionAlias").toString();
		String packageName = IDataUtil.get(pipelineCursor,"packageName").toString();
		String adapterTypeName = IDataUtil.get(pipelineCursor,"adapterTypeName").toString();
		String connectionFactoryType = IDataUtil.get(pipelineCursor,"connectionFactoryType").toString();
		String transactionType = IDataUtil.get(pipelineCursor,"transactionType").toString();
		String datasourceClass = IDataUtil.get(pipelineCursor,"datasourceClass").toString();
		String serverName = IDataUtil.get(pipelineCursor,"serverName").toString();
		String user = IDataUtil.get(pipelineCursor,"user").toString();
		String password = IDataUtil.get(pipelineCursor,"password").toString();
		String databaseName = IDataUtil.get(pipelineCursor,"databaseName").toString();
		String portNumber = IDataUtil.get(pipelineCursor,"portNumber").toString();
		String networkProtocol = IDataUtil.get(pipelineCursor,"networkProtocol").toString();
		String otherProperties = IDataUtil.get(pipelineCursor,"otherProperties").toString();
		Object oDocument[][] = {{"transactionType", transactionType},
			{"datasourceClass", datasourceClass},
			{"serverName", serverName}, {"user", user},
			{"password", password},{"databaseName", databaseName},
			{"portNumber", portNumber},{"networkProtocol", networkProtocol},
			{"otherProperties", otherProperties}};
		T_row = (IData)new Values(oDocument);
		pipelineCursor.insertAfter("connectionAlias", connectionAlias);
		pipelineCursor.insertAfter("packageName", packageName);
		pipelineCursor.insertAfter("adapterTypeName", adapterTypeName);
		pipelineCursor.insertAfter("connectionFactoryType", connectionFactoryType);
		ValuesEmulator.put(pipeline,"connectionSettings",T_row);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void loadConnectionProperties (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(loadConnectionProperties)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [o] field:0:required connectionAlias
		// [o] field:0:required packageName
		// [o] field:0:required adapterTypeName
		// [o] field:0:required connectionFactoryType
		// [o] field:0:required serverName
		// [o] field:0:required siebelEnterprise
		// [o] field:0:required objectManager
		// [o] field:0:required language
		// [o] field:0:required username
		// [o] field:0:required password
		// [o] field:0:required expireTimeout
		// [o] field:0:required startupRetryCount
		IDataCursor idatacursor = pipeline.getCursor();
		String connectionAlias = "com.webmethods.adapters.jdbc.connections.oracle:Connection";
		String packageName = "JDBCRegression";
		String adapterTypeName = "JDBCAdapter";
		String connectionFactoryType = "com.wm.adapter.wmjdbc.connection.JDBCConnectionFactory";
		String transactionType = "";
		String datasourceClass = "";
		String serverName = "";
		String databaseName = "";
		String username = "";
		String password = "";
		String portNumber = "";
		String networkProtocol = "";
		String otherProperties = "";
		try
		{
			Properties prop = new Properties();
			String propPath = "packages\\JDBCRegression\\config\\JDBCAutomation.properties";
			prop.load(new FileInputStream(propPath));
		        if(prop.get("connectionAlias")!= null)
				connectionAlias = (String)prop.get("connectionAlias");
		        if(prop.get("adapterTypeName")!= null)
				adapterTypeName = (String)prop.get("adapterTypeName");
		        if(prop.get("packageName")!= null)
				packageName = (String)prop.get("packageName");
		        if(prop.get("connectionFactoryType")!= null)
				connectionFactoryType = (String)prop.get("connectionFactoryType");
		        if(prop.get("transactionType")!= null)
				transactionType = (String)prop.get("transactionType");
			if(prop.get("datasourceClass")!= null)
				datasourceClass = (String)prop.get("datasourceClass");
			if(prop.get("serverName")!= null)
				serverName = (String)prop.get("serverName");
		        if(prop.get("databaseName")!= null)
				databaseName = (String)prop.get("databaseName");	 
			if(prop.get("username")!= null)
				username = (String)prop.get("username");	 
			if(prop.get("password")!= null)
				password = (String)prop.get("password");	 
			if(prop.get("portNumber")!= null)
				portNumber = (String)prop.get("portNumber");	 
			if(prop.get("networkProtocol")!= null)
				networkProtocol = (String)prop.get("networkProtocol");	 
			if(prop.get("otherProperties")!= null)
				otherProperties = (String)prop.get("otherProperties");	 
		}
		catch(Exception e)
		{
			//ignore the exception and default the values
		}
		idatacursor.insertAfter("connectionAlias", connectionAlias);
		idatacursor.insertAfter("packageName", packageName);
		idatacursor.insertAfter("adapterTypeName", adapterTypeName);
		idatacursor.insertAfter("connectionFactoryType", connectionFactoryType);
		idatacursor.insertAfter("transactionType", transactionType);
		idatacursor.insertAfter("datasourceClass", datasourceClass);
		idatacursor.insertAfter("serverName", serverName);
		idatacursor.insertAfter("databaseName", databaseName);
		idatacursor.insertAfter("username", username);
		idatacursor.insertAfter("password", password);
		idatacursor.insertAfter("portNumber", portNumber);
		idatacursor.insertAfter("networkProtocol", networkProtocol);
		idatacursor.insertAfter("otherProperties", otherProperties);
		idatacursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

