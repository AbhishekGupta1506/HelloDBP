package com.webmethods.adapters.jdbc.services.update.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-10-10 15:54:14 GMT+05:30
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
		// [i] object:0:required int_col
		// [i] object:0:required blobSize
		// [i] object:0:required clobSize
		// [o] object:0:required INT
		// [o] object:0:required BLOB
		// [o] field:0:required CLOB
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Integer int_col = (Integer)IDataUtil.get(pipelineCursor,"int_col");
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
		pipelineCursor.insertAfter("INT", new BigDecimal(int_col.intValue()));
		pipelineCursor.insertAfter("BLOB", byteArray);
		pipelineCursor.insertAfter("CLOB", new String(charArray));
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

