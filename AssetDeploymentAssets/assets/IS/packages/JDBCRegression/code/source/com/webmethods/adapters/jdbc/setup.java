package com.webmethods.adapters.jdbc;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-07-20 09:36:33 IST
// -----( ON-HOST: 172.31.93.69

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.IOException;
import java.io.File;
// --- <<IS-END-IMPORTS>> ---

public final class setup

{
	// ---( internal utility methods )---

	final static setup _instance = new setup();

	static setup _newInstance() { return new setup(); }

	static setup _cast(Object o) { return (setup)o; }

	// ---( server methods )---




	public static final void SetupJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(SetupJava)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required fileName
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String fileName = IDataUtil.get(pipelineCursor,"fileName").toString();
		File file = new File("temp.txt");
		System.out.println(file.getAbsolutePath());
		/*try
		{
			Runtime.getRuntime().exec(fileName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

