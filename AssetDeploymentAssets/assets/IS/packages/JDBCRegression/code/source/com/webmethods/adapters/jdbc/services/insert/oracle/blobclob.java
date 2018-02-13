package com.webmethods.adapters.jdbc.services.insert.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2009-07-09 11:15:43 GMT+05:30
// -----( ON-HOST: VMMVADIVEL1.eur.ad.sag

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




	public static final void generateLargeBLOB (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(generateLargeBLOB)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required int_col
		// [i] object:0:required blobSize
		// [o] object:0:required INT
		// [o] object:0:required InputStream
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Integer int_col = (Integer)IDataUtil.get(pipelineCursor,"int_col");
		Long blobSize = (Long)IDataUtil.get(pipelineCursor,"blobSize");
		InputStream inputStream;
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
		pipelineCursor.insertAfter("INT", new BigDecimal(int_col.intValue()));
		pipelineCursor.insertAfter("InputStream", inputStream);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void generateLargeCLOB (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(generateLargeCLOB)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required int_col
		// [i] object:0:required clobSize
		// [o] object:0:required INT
		// [o] object:0:required Reader
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Integer int_col = (Integer)IDataUtil.get(pipelineCursor,"int_col");
		Long clobSize = (Long)IDataUtil.get(pipelineCursor,"clobSize");
		Reader reader;
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
		pipelineCursor.insertAfter("INT", new BigDecimal(int_col.intValue()));
		pipelineCursor.insertAfter("Reader", reader);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



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
			byteArray[iCount] = 1;
		}
		for (int iCount = 0; iCount < clobSize.intValue(); iCount++)
		{
			charArray[iCount] = '$';
		}
		pipelineCursor.insertAfter("INT", new BigDecimal(int_col.intValue()));
		pipelineCursor.insertAfter("BLOB", byteArray);
		pipelineCursor.insertAfter("CLOB", new String(charArray));
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void readFromFile (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(readFromFile)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required int_col
		// [o] object:0:required INT
		// [o] object:0:required BLOB
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Integer int_col = (Integer)IDataUtil.get(pipelineCursor,"int_col");
		byte[] b;
		try
		{
			File file = new File("C:\\InternalPlatformProduct_1000K.txt");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
			int arraySize = (int)file.length();
			b = new byte[arraySize];	
			int offset = 0;
			while (bufferedInputStream.read() != -1)
			{
				bufferedInputStream.read(b, 0, arraySize);
			}
			bufferedInputStream.close();
		}
		catch (IOException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.insertAfter("INT", new BigDecimal(int_col.intValue()));
		pipelineCursor.insertAfter("BLOB", b);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

