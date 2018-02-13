package com.webmethods.adapters.jdbc.services.select.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-10-30 12:54:43 IST
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




	public static final void getBLOBLength (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getBLOBLength)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required InputStream
		// [o] object:0:required blobSize
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Object object = IDataUtil.get(pipelineCursor,"InputStream");
		InputStream inputStream = (InputStream)IDataUtil.get(pipelineCursor,"InputStream");
		Long blobSize;
		try
		{
			long bytesRead = 0;
			while (inputStream.read() != -1)
			{
				bytesRead++;
			}
			inputStream.close();
			blobSize = new Long(bytesRead);
		}
		catch (IOException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.insertAfter("blobSize", blobSize);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void getCLOBLength (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getCLOBLength)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required Reader
		// [o] object:0:required clobSize
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Object object = IDataUtil.get(pipelineCursor,"Reader");
		Reader reader = (Reader)IDataUtil.get(pipelineCursor,"Reader");
		Long clobSize;
		try
		{
			long charsRead = 0;
			while (reader.read() != -1)
			{
				charsRead++;
			}
			reader.close();
			clobSize = new Long(charsRead);
		}
		catch (IOException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.insertAfter("clobSize", clobSize);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void getStreamContent (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getStreamContent)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] object:0:required Stream
		// [o] object:0:required isMatching
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		BufferedInputStream bufferedInputStream = (BufferedInputStream)IDataUtil.get(pipelineCursor,"Stream");
		Boolean isMatching = null;
		try
		{
			byte[] bytesRead = new byte[87];
			bufferedInputStream.read();
			bufferedInputStream.read(bytesRead,0,87);
			bufferedInputStream.close();
			String strBytes = new String(bytesRead);
			if (strBytes.matches("spy(.)+") && strBytes.matches("(.)+DataSource.getPooledConnection()(.)*"))
				isMatching = new Boolean(true);
			else
				isMatching = new Boolean(false);
		}
		catch (IOException e)
		{
			throw new ServiceException(e);
		}
		pipelineCursor.insertAfter("isMatching", isMatching);
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

