package com.webmethods.adapters.jdbc.notifications.basic.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-07-31 14:58:20 IST
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class V10g

{
	// ---( internal utility methods )---

	final static V10g _instance = new V10g();

	static V10g _newInstance() { return new V10g(); }

	static V10g _cast(Object o) { return (V10g)o; }

	// ---( server methods )---




	public static final void setTimeout (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(setTimeout)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required timeout
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String sTimeout = IDataUtil.getString( pipelineCursor, "timeout");
		try
		{
			Thread.sleep(Integer.parseInt(sTimeout));
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

