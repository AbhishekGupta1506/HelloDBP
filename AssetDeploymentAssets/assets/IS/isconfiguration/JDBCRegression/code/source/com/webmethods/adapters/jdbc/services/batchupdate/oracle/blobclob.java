package com.webmethods.adapters.jdbc.services.batchupdate.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-10-12 14:11:07 GMT+05:30
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.math.BigDecimal;
import java.io.*;
// --- <<IS-END-IMPORTS>> ---

public final class blobclob

{
	// ---( internal utility methods )---

	final static blobclob _instance = new blobclob();

	static blobclob _newInstance() { return new blobclob(); }

	static blobclob _cast(Object o) { return (blobclob)o; }

	// ---( server methods )---




	public static final void populateByteString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(populateByteString)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required recordCount
		// [i] object:0:required blobSize
		// [i] object:0:required clobSize
		// [o] record:1:required inputs
		// [o] - object:0:required BLOB_COL
		// [o] - field:0:required CLOB_COL
		// [o] - object:0:required INT_COL
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Integer recordCount = (Integer)IDataUtil.get(pipelineCursor,"recordCount");
		Integer blobSize = (Integer)IDataUtil.get(pipelineCursor,"blobSize");
		Integer clobSize = (Integer)IDataUtil.get(pipelineCursor,"clobSize");
		byte[] byteArray = new byte[blobSize.intValue()];
		char[] charArray = new char[clobSize.intValue()];
		for (int iCount = 0; iCount < blobSize.intValue(); iCount++)
		{
			byteArray[iCount] = (byte)(iCount % 128);
		}
		for (int iCount = 0; iCount < clobSize.intValue(); iCount++)
		{
			charArray[iCount] = '#';
		}
		// Initialize start
		int start = 1;
		IData [] T_row = new IData[recordCount.intValue()];
		for (int i = start; i <= recordCount.intValue(); i++)
		{	
			Object orow[][] = {{"BLOB_COL", byteArray},
				{"CLOB_COL", new String(charArray)},
				{"INT_COL", new BigDecimal(i)}};
			T_row[i-start] = (IData)new Values(orow);
		}
		ValuesEmulator.put(pipeline,"inputs",T_row);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

