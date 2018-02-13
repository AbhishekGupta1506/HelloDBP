package com.webmethods.adapters.jdbc.services.batchinsert.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-10-19 12:46:02 IST
// -----( ON-HOST: rtomi-opt620.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.math.BigDecimal;
import java.io.*;
// --- <<IS-END-IMPORTS>> ---

public final class streaming

{
	// ---( internal utility methods )---

	final static streaming _instance = new streaming();

	static streaming _newInstance() { return new streaming(); }

	static streaming _cast(Object o) { return (streaming)o; }

	// ---( server methods )---




	public static final void generateBLOBCLOB (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(generateBLOBCLOB)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required recordCount
		// [i] object:0:required blobSize
		// [i] object:0:required clobSize
		// [o] record:1:required inputs
		// [o] - object:0:required INT_COL
		// [o] - object:0:required BLOB_COL
		// [o] - object:0:required CLOB_COL
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Integer recordCount = (Integer)IDataUtil.get(pipelineCursor,"recordCount");
		Long blobSize = (Long)IDataUtil.get(pipelineCursor,"blobSize");
		Long clobSize = (Long)IDataUtil.get(pipelineCursor,"clobSize");
		InputStream inputStream;
		Reader reader;
		try
		{
			File tempFile = File.createTempFile("blob",".tmp");
			FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
			int arraySize = 1024;
			byte[] b = new byte[arraySize];
			for (int i = 0; i < b.length; i++)
			{
				b[i] = (byte)(i % 128);
			}
			long bytesWritten = 0;
			while (bytesWritten < blobSize.longValue())
			{
				if ((blobSize.longValue() - bytesWritten) < arraySize)
				{
					arraySize = (int)(blobSize.longValue() - bytesWritten);
				}		
				fileOutputStream.write(b, 0, arraySize);
				bytesWritten += arraySize;
			}
			fileOutputStream.close();
			inputStream = new FileInputStream(tempFile);
		}
		catch (IOException e)
		{
			throw new ServiceException(e);
		}
		try
		{
			File tempFile = File.createTempFile("clob",".tmp");
			FileWriter fileWriter = new FileWriter(tempFile);
			int arraySize = 1024;
			char[] c = new char[arraySize];
			for (int i = 0; i < c.length; i++)
			{
				c[i] = 'c';
			}
			long charsWritten = 0;
			while (charsWritten < clobSize.longValue())
			{
				if ((clobSize.longValue() - charsWritten) < arraySize)
				{
					arraySize = (int)(clobSize.longValue() - charsWritten);
				}		
				fileWriter.write(c, 0, arraySize);
				charsWritten += arraySize;
			}
			fileWriter.close();
			reader = new FileReader(tempFile);
		}
		catch (IOException e)
		{
			throw new ServiceException(e);
		}
		// Initialize start
		int start = 1;
		IData [] T_row = new IData[recordCount.intValue()];
		for (int i = start; i <= recordCount.intValue(); i++)
		{	
			Object orow[][] = {{"INT_COL", new BigDecimal(i)},
				{"BLOB_COL", inputStream},
				{"CLOB_COL", reader}};
			T_row[i-start] = (IData)new Values(orow);
		}
		ValuesEmulator.put(pipeline,"inputs",T_row);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

