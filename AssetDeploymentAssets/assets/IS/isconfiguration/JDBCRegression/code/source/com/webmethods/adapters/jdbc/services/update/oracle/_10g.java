package com.webmethods.adapters.jdbc.services.update.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-08-02 19:09:49 IST
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.sql.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;
// --- <<IS-END-IMPORTS>> ---

public final class _10g

{
	// ---( internal utility methods )---

	final static _10g _instance = new _10g();

	static _10g _newInstance() { return new _10g(); }

	static _10g _cast(Object o) { return (_10g)o; }

	// ---( server methods )---




	public static final void populateInput (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(populateInput)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required int
		// [o] object:0:required BLOB_COL
		// [o] field:0:required CHAR_COL
		// [o] field:0:required CHARACTER_COL
		// [o] field:0:required CLOB_COL
		// [o] object:0:required DATE_COL
		// [o] object:0:required DEC_COL
		// [o] object:0:required DECIMAL_COL
		// [o] object:0:required DOUBLEPRECISION_COL
		// [o] object:0:required FLOAT_COL
		// [o] object:0:required INT_COL
		// [o] object:0:required INTEGER_COL
		// [o] field:0:required LONG_COL
		// [o] field:0:required NCHAR_COL
		// [o] field:0:required NCLOB_COL
		// [o] object:0:required NUMBER_COL
		// [o] field:0:required NVARCHAR2_COL
		// [o] object:0:required RAW_COL
		// [o] object:0:required REAL_COL
		// [o] field:0:required ROWID_COL
		// [o] object:0:required SMALLINT_COL
		// [o] object:0:required TIMESTAMP_COL
		// [o] field:0:required UROWID_COL
		// [o] field:0:required VARCHAR2_COL
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String oint = IDataUtil.get(pipelineCursor,"int").toString();
		pipelineCursor.insertAfter("BFILE_COL", new String("ocrs12.zip"));
		pipelineCursor.insertAfter("BINARYDOUBLE_COL", new Double(2.34));
		pipelineCursor.insertAfter("BINARYFLOAT_COL", new Double(2.34));
		pipelineCursor.insertAfter("BLOB_COL", new String("Updated Blob Column Values").getBytes());
		pipelineCursor.insertAfter("CHAR_COL", new String("Updated"));
		pipelineCursor.insertAfter("CHARACTER_COL", new String("U"));
		pipelineCursor.insertAfter("CLOB_COL", new String("Updated Clob Column Values"));
		pipelineCursor.insertAfter("DATE_COL", Date.valueOf("1950-01-26"));
		pipelineCursor.insertAfter("DEC_COL", new BigDecimal("2.34"));
		pipelineCursor.insertAfter("DECIMAL_COL", new BigDecimal("2.345"));
		pipelineCursor.insertAfter("DOUBLEPRECISION_COL", new Double(2.34));
		pipelineCursor.insertAfter("FLOAT_COL", new Double(2.34));
		pipelineCursor.insertAfter("INT_COL", new BigDecimal(oint));
		pipelineCursor.insertAfter("INTEGER_COL", new BigDecimal(200));
		pipelineCursor.insertAfter("LONG_COL", new String("Updated Long"));
		pipelineCursor.insertAfter("NCHAR_COL", new String("Updated"));
		pipelineCursor.insertAfter("NCLOB_COL", new String("Updated NCLOB Column Values"));
		pipelineCursor.insertAfter("NUMBER_COL", new BigDecimal("2.34"));
		pipelineCursor.insertAfter("NVARCHAR2_COL", new String("Updated NVarcha"));
		pipelineCursor.insertAfter("RAW_COL", new String("UpdatedRAW").getBytes());
		pipelineCursor.insertAfter("REAL_COL", new Double(2.34));
		pipelineCursor.insertAfter("ROWID_COL", new String("000001F8.0001.0007"));
		pipelineCursor.insertAfter("SMALLINT_COL", new BigDecimal("2"));
		pipelineCursor.insertAfter("TIMESTAMP_COL", Timestamp.valueOf("1950-01-26 12:30:30.300"));
		pipelineCursor.insertAfter("UROWID_COL", new String("000001F8.0001.0007"));
		pipelineCursor.insertAfter("VARCHAR2_COL", new String("Updated Varchar2"));
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

