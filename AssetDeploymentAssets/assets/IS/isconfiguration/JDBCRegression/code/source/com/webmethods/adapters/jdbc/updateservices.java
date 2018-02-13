package com.webmethods.adapters.jdbc;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-07-27 19:01:45 IST
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class updateservices

{
	// ---( internal utility methods )---

	final static updateservices _instance = new updateservices();

	static updateservices _newInstance() { return new updateservices(); }

	static updateservices _cast(Object o) { return (updateservices)o; }

	// ---( server methods )---




	public static final void matchJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(matchJava)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required service
		// [i] field:0:required folder
		// [o] record:0:required serviceDataList
		// [o] - field:0:required serviceNodeName
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String service = IDataUtil.get(pipelineCursor,"service").toString();
		String folder = IDataUtil.get(pipelineCursor,"folder").toString();
		String[] folderAndService = service.split(":");
		String folderOfService = folderAndService[0];
		boolean flag = folderOfService.equals(folder);
		if (flag)
		{
		    pipelineCursor.insertAfter("serviceDataList/serviceNodeName", service);
		}
		
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

