package com.webmethods.adapters.jdbc.services.execService;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-11-11 13:34:47 IST
// -----( ON-HOST: rtomi-opt620.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.sql.Connection;
import java.sql.SQLException;
// --- <<IS-END-IMPORTS>> ---

public final class oracle

{
	// ---( internal utility methods )---

	final static oracle _instance = new oracle();

	static oracle _newInstance() { return new oracle(); }

	static oracle _cast(Object o) { return (oracle)o; }

	// ---( server methods )---




	public static final void insertRecord (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(insertRecord)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required $db_service_connection
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Connection connection = (Connection)IDataUtil.get(pipelineCursor,"$db_service_connection");
		String sql = new String("insert into Table1#$_ values (12,'Home')");
		try
		{
			connection.createStatement().execute(sql);
		}
		catch (SQLException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void testConnection (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(testConnection)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required $db_service_connection
		// pipeline
		/*IDataCursor pipelineCursor = pipeline.getCursor();
		//Connection connection = (Connection)IDataUtil.get(pipelineCursor,"$db_service_connection");
		Connection connection = (Connection)IDataUtil.get(pipelineCursor,com.wm.adapter.wmjdbc.services.ExecuteService.PIPELINE_CONNECTION);
		try
		{
			System.out.println("DEBUG: AUTO COMMIT? " + connection.getAutoCommit());
			System.out.println("DEBUG: CATALOG " + connection.getCatalog());
			System.out.println("DEBUG: HOLDABILITY " + connection.getHoldability());
			System.out.println("DEBUG: TRANSACTION ISOLATION " + connection.getTransactionIsolation());
			System.out.println("DEBUG: IS CLOSED " + connection.isClosed());
			System.out.println("DEBUG: IS READ ONLY " + connection.isReadOnly());
			//connection.commit(); //Error is thrown
			//connection.close(); //Error is thrown
			//connection.setAutoCommit(true); //Error is thrown
			//connection.clearWarnings();
			//connection.createStatement().execute("insert into Table1#$_ values (11,'Varchar2')");
			//connection.rollback();
			System.out.println("DEBUG: Driver Version " + connection.getMetaData().getDriverVersion());
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		pipelineCursor.destroy();
		*/
		java.sql.Connection conn = (java.sql.Connection)IDataUtil.get(pipeline.getCursor(),com.wm.adapter.wmjdbc.services.ExecuteService.PIPELINE_CONNECTION);
		try
		{
		java.sql.PreparedStatement pstmt=conn.prepareStatement("insert into Person values(1,'Chris')");
		pstmt.execute();
		}
		catch(Throwable e)
		{
		e.printStackTrace();
		throw new ServiceException(e);
		}
		// --- <<IS-END>> ---

                
	}



	public static final void updateRecord (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(updateRecord)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required $db_service_connection
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Connection connection = (Connection)IDataUtil.get(pipelineCursor,"$db_service_connection");
		String sql = new String("update Table1#$_ set F1#$_='House'");
		try
		{
			connection.createStatement().execute(sql);
		}
		catch (SQLException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void useConnection (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(useConnection)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required $db_service_connection
		// [i] object:0:required ID
		// [i] field:0:required Name
		// [i] record:0:required PermAddress
		// [i] - field:0:required House
		// [i] - object:0:required Street
		// [i] record:1:required OtherAddress
		// [i] - field:0:required House
		// [i] - object:0:required Street
		// [o] record:0:required Customer
		// [o] - object:0:required CID
		// [o] - field:0:required CName
		// [o] - record:0:required CPermAddress
		// [o] -- field:0:required House
		// [o] -- object:0:required Street
		// [o] - record:1:required COtherAddress
		// [o] -- field:0:required House
		// [o] -- object:0:required Street
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Connection connection = (Connection)IDataUtil.get(pipelineCursor,"$db_service_connection");
		IData PermAddress = (IData)IDataUtil.get(pipelineCursor, "PermAddress");
		String House = IDataUtil.get(PermAddress.getCursor(), "House").toString();
		Integer Street = (Integer)IDataUtil.get(PermAddress.getCursor(), "Street");
		String sql = new String("insert into Table1#$_ values (" + Street.intValue() + ",'" + House + "')");
		try
		{
			connection.createStatement().execute(sql);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		int start = 1, count=2;
		IData [] otherAddress = new IData[count];
		
		for (int i = start; i <= count; i++)
		{	
			Object orow[][] = {{"House", new String("Peace Home")},
				{"Street", new Integer(i)}};
			otherAddress[i-start] = (IData)new Values(orow);
		}
		
		Object permAddress[][] = {{"House", new String("Peace")},
				{"Street", new Integer(11)}};
		Object employee[][] = {{"CID", new Integer(1)}, 
			{"CName", new String("Bose")}, 
			{"CPermAddress",(IData)new Values(permAddress)},
			{"COtherAddress",otherAddress}};
		IDataUtil.put(pipelineCursor,"Customer",(IData)new Values(employee));
		//Remove the Name from Pipeline
		IDataUtil.remove(pipelineCursor,"Name");
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

