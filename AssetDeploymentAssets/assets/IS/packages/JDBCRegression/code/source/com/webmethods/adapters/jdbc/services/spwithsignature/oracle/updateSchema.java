package com.webmethods.adapters.jdbc.services.spwithsignature.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-09-28 11:09:28 GMT+05:30
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class updateSchema

{
	// ---( internal utility methods )---

	final static updateSchema _instance = new updateSchema();

	static updateSchema _newInstance() { return new updateSchema(); }

	static updateSchema _cast(Object o) { return (updateSchema)o; }

	// ---( server methods )---




	public static final void getBooleanValues (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getBooleanValues)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [o] object:0:required true
		// [o] object:0:required false
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		pipelineCursor.insertAfter("true", new Boolean(true));
		pipelineCursor.insertAfter("false", new Boolean(false));
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

