package com.webmethods.adapters.jdbc.services.select.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-10-10 14:52:35 GMT+05:30
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.sql.*;
import java.io.*;
import java.math.BigDecimal;
// --- <<IS-END-IMPORTS>> ---

public final class blobclob

{
	// ---( internal utility methods )---

	final static blobclob _instance = new blobclob();

	static blobclob _newInstance() { return new blobclob(); }

	static blobclob _cast(Object o) { return (blobclob)o; }

	// ---( server methods )---




	public static final void cleanUpBlobAndClob (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(cleanUpBlobAndClob)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.remove(pipelineCursor,"ByteStringOutput");
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void getBlobClob (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getBlobClob)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required BLOB_COL
		// [i] object:0:required CLOB_COL
		// [o] object:0:required blobSize
		// [o] object:0:required clobSize
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Blob blob = (Blob)IDataUtil.get(pipelineCursor,"BLOB_COL"); 
		Clob clob = (Clob)IDataUtil.get(pipelineCursor,"CLOB_COL");
		try
		{
			pipelineCursor.insertAfter("blobSize", new Long(blob.length()));
			pipelineCursor.insertAfter("clobSize", new Long(clob.length()));
		}
		catch(SQLException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void getByteString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getByteString)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required BLOB_COL
		// [i] field:0:required CLOB_COL
		// [o] object:0:required blobSize
		// [o] object:0:required clobSize
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		byte[] byteArray = (byte[])IDataUtil.get(pipelineCursor,"BLOB_COL");
		String strClob = IDataUtil.get(pipelineCursor,"CLOB_COL").toString();
		pipelineCursor.insertAfter("blobSize", new Integer(byteArray.length));
		pipelineCursor.insertAfter("clobSize", new Integer(strClob.length()));
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void writeIntoFile (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(writeIntoFile)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required BLOB
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		byte[] b = (byte[])IDataUtil.get(pipelineCursor,"BLOB");
		try
		{
			File file = new File("D:\\Temp\\CHOCOLATE_THEME.mp3");
			//file.createNewFile();
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
			bufferedOutputStream.write(b, 0, b.length);
			bufferedOutputStream.close();
		}
		catch (IOException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

