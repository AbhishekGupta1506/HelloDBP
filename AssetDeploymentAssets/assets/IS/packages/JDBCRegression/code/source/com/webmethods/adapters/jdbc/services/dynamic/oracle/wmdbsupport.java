package com.webmethods.adapters.jdbc.services.dynamic.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-11-07 10:32:57 IST
// -----( ON-HOST: rtomi-opt620.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.sql.*;
import java.io.*;
import java.math.BigDecimal;
// --- <<IS-END-IMPORTS>> ---

public final class wmdbsupport

{
	// ---( internal utility methods )---

	final static wmdbsupport _instance = new wmdbsupport();

	static wmdbsupport _newInstance() { return new wmdbsupport(); }

	static wmdbsupport _cast(Object o) { return (wmdbsupport)o; }

	// ---( server methods )---




	public static final void getClassName (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getClassName)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] record:0:required parentDoc
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		IData DynamicSelect = (IData)IDataUtil.get(pipelineCursor,"parentDoc");
		IData[] results = (IData[])IDataUtil.get(DynamicSelect.getCursor(),"results");
		IDataCursor resultCursor = results[0].getCursor();
		IDataUtil.put(pipelineCursor,"BFILE_COL",IDataUtil.get(resultCursor,"BFILE_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"BINARYDOUBLE_COL",IDataUtil.get(resultCursor,"BINARYDOUBLE_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"BINARYFLOAT_COL",IDataUtil.get(resultCursor,"BINARYFLOAT_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"CHAR_COL",IDataUtil.get(resultCursor,"CHAR_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"CHARACTER_COL",IDataUtil.get(resultCursor,"CHARACTER_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"DATE_COL",IDataUtil.get(resultCursor,"DATE_COL").getClass().getName());
		IDataUtil.put(pipelineCursor,"DEC_COL",IDataUtil.get(resultCursor,"DEC_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"DECIMAL_COL",IDataUtil.get(resultCursor,"DECIMAL_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"DOUBLEPRECISION_COL",IDataUtil.get(resultCursor,"DOUBLEPRECISION_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"FLOAT_COL",IDataUtil.get(resultCursor,"FLOAT_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"INT_COL",IDataUtil.get(resultCursor,"INT_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"INTEGER_COL",IDataUtil.get(resultCursor,"INTEGER_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"INTERVALDAYTOSECOND_COL",IDataUtil.get(resultCursor,"INTERVALDAYTOSECOND_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"INTERVALYEARTOMONTH_COL",IDataUtil.get(resultCursor,"INTERVALYEARTOMONTH_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"LONG_COL",IDataUtil.get(resultCursor,"LONG_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"NCHAR_COL",IDataUtil.get(resultCursor,"NCHAR_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"NCLOB_COL",IDataUtil.get(resultCursor,"NCLOB_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"NUMBER_COL",IDataUtil.get(resultCursor,"NUMBER_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"NVARCHAR2_COL",IDataUtil.get(resultCursor,"NVARCHAR2_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"RAW_COL",IDataUtil.get(resultCursor,"RAW_COL").getClass().getName());
		IDataUtil.put(pipelineCursor,"REAL_COL",IDataUtil.get(resultCursor,"REAL_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"ROWID_COL",IDataUtil.get(resultCursor,"ROWID_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"SMALLINT_COL",IDataUtil.get(resultCursor,"SMALLINT_COL").getClass().getName());
		IDataUtil.put(pipelineCursor,"TIMESTAMP_COL",IDataUtil.get(resultCursor,"TIMESTAMP_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"TIMESTAMPWITHLOCALTIMEZONE_COL",IDataUtil.get(resultCursor,"TIMESTAMPWITHLOCALTIMEZONE_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"TIMESTAMPWITHTIMEZONE_COL",IDataUtil.get(resultCursor,"TIMESTAMPWITHTIMEZONE_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"UROWID_COL",IDataUtil.get(resultCursor,"UROWID_COL").getClass().getName()); 
		IDataUtil.put(pipelineCursor,"VARCHAR2_COL",IDataUtil.get(resultCursor,"VARCHAR2_COL").getClass().getName());
		IDataUtil.put(pipelineCursor,"BLOB_COL",IDataUtil.get(resultCursor,"BLOB_COL").getClass().getName());
		IDataUtil.put(pipelineCursor,"CLOB_COL",IDataUtil.get(resultCursor,"CLOB_COL").getClass().getName());
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

