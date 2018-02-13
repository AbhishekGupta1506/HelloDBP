package com.webmethods.adapters.jdbc.services.execService;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-10-06 12:20:32 GMT+05:30
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.sql.Connection;
import java.sql.SQLException;
// --- <<IS-END-IMPORTS>> ---

public final class common

{
	// ---( internal utility methods )---

	final static common _instance = new common();

	static common _newInstance() { return new common(); }

	static common _cast(Object o) { return (common)o; }

	// ---( server methods )---




	public static final void closeConnection (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(closeConnection)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required $db_service_connection
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Connection connection = (Connection)IDataUtil.get(pipelineCursor,"$db_service_connection");
		try
		{
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void commitService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(commitService)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required $db_service_connection
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Connection connection = (Connection)IDataUtil.get(pipelineCursor,"$db_service_connection");
		try
		{
			connection.commit();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void generateInput (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(generateInput)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required arraySize
		// [o] record:0:required Employee
		// [o] - object:0:required ID
		// [o] - field:0:required Name
		// [o] - record:0:required PermAddress
		// [o] -- field:0:required House
		// [o] -- object:0:required Street
		// [o] - record:1:required OtherAddress
		// [o] -- field:0:required House
		// [o] -- object:0:required Street
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Integer arraySize = (Integer)IDataUtil.get(pipelineCursor,"arraySize");
		int count = arraySize.intValue();
		int start = 1;
		IData [] otherAddress = new IData[count];
		
		for (int i = start; i <= count; i++)
		{	
			Object orow[][] = {{"House", new String("Divine Home")},
				{"Street", new Integer(i)}};
			otherAddress[i-start] = (IData)new Values(orow);
		}
		
		Object permAddress[][] = {{"House", new String("Divine")},
				{"Street", new Integer(11)}};
		Object employee[][] = {{"ID", new Integer(1)}, 
			{"Name", new String("Bose")}, 
			{"PermAddress",(IData)new Values(permAddress)},
			{"OtherAddress",otherAddress}};
		IDataUtil.put(pipelineCursor,"Employee",(IData)new Values(employee));
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void processOutput (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(processOutput)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] record:0:required Customer
		// [i] - object:0:required CID
		// [i] - field:0:required CName
		// [i] - record:0:required CPermAddress
		// [i] -- field:0:required House
		// [i] -- object:0:required Street
		// [i] - record:1:required COtherAddress
		// [i] -- field:0:required House
		// [i] -- object:0:required Street
		// [o] object:0:required $db_service_connection
		// [o] object:0:required COStreet
		// [o] object:0:required Name
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Object connection = IDataUtil.get(pipelineCursor,"$db_service_connection");
		IData ExecServiceIOOutput = (IData)IDataUtil.get(pipelineCursor,"ExecServiceIOOutput");
		IData targetServiceOutput = (IData)IDataUtil.get(ExecServiceIOOutput.getCursor(),"targetServiceOutput");
		Object Name = IDataUtil.get(targetServiceOutput.getCursor(),"Name");
		IData Customer = (IData)IDataUtil.get(targetServiceOutput.getCursor(),"Customer");
		IData[] COtherAddress = (IData[])IDataUtil.get(Customer.getCursor(),"COtherAddress");
		Integer Street = (Integer)IDataUtil.get(COtherAddress[1].getCursor(),"Street");
		IDataUtil.put(pipelineCursor,"$db_service_connection",connection);
		IDataUtil.put(pipelineCursor,"COStreet",Street);
		IDataUtil.put(pipelineCursor,"Name",Name);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void setAutoCommitService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(setAutoCommitService)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required $db_service_connection
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Connection connection = (Connection)IDataUtil.get(pipelineCursor,"$db_service_connection");
		try
		{
			connection.setAutoCommit(false);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

