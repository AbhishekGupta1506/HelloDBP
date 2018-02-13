package com.webmethods.adapters.jdbc.services.batchupdate.oracle;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2006-07-29 14:14:21 IST
// -----( ON-HOST: rtomi-opt170.webm.webmethods.com

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.sql.Date;
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
		// [o] record:1:required inputs
		// [o] - object:0:required BLOB_COL
		// [o] - field:0:required CHAR_COL
		// [o] - field:0:required CHARACTER_COL
		// [o] - field:0:required CLOB_COL
		// [o] - object:0:required DATE_COL
		// [o] - object:0:required DEC_COL
		// [o] - object:0:required DECIMAL_COL
		// [o] - object:0:required DOUBLEPRECISION_COL
		// [o] - object:0:required FLOAT_COL
		// [o] - object:0:required INT_COL
		// [o] - object:0:required INTEGER_COL
		// [o] - field:0:required LONG_COL
		// [o] - field:0:required MLSLABEL_COL
		// [o] - field:0:required NCHAR_COL
		// [o] - field:0:required NCLOB_COL
		// [o] - object:0:required NUMBER_COL
		// [o] - field:0:required NVARCHAR2_COL
		// [o] - object:0:required RAW_COL
		// [o] - object:0:required REAL_COL
		// [o] - field:0:required ROWID_COL
		// [o] - object:0:required SMALLINT_COL
		// [o] - object:0:required TIMESTAMP_COL
		// [o] - field:0:required UROWID_COL
		// [o] - field:0:required VARCHAR2_COL
		// [o] - object:0:required input
		// Initialize start
		int start = 1;
		IData [] T_row = new IData[10];
		for (int i = start; i <=10; i++)
		{	
			Object orow[][] = {{"BLOB_COL", new String("Updated Blob Column Values").getBytes()},
				{"CHAR_COL", new String("Updated")},{"CHARACTER_COL", new String("U")},
				{"CLOB_COL", new String("Updated Clob Column Values")},{"DATE_COL", Date.valueOf("1950-01-26")},
				{"DEC_COL", new BigDecimal("2.34")},{"DECIMAL_COL", new BigDecimal("2.345")},
				{"DOUBLEPRECISION_COL", new Double(2.34)},{"FLOAT_COL", new Double(2.34)},
				{"INT_COL", new BigDecimal(i)},{"INTEGER_COL", new BigDecimal(200)},
				{"LONG_COL", new String("Updated Long")},{"NCHAR_COL", new String("Updated")},
				{"NCLOB_COL", new String("Updated NCLOB Column Values")},{"NUMBER_COL", new BigDecimal("2.34")},
				{"NVARCHAR2_COL", new String("Updated NVarcha")},{"RAW_COL", new String("UpdatedRAW").getBytes()},
				{"REAL_COL", new Double(2.34)},{"ROWID_COL", new String("000001F8.0001.0007")},
				{"SMALLINT_COL", new BigDecimal("2")},{"TIMESTAMP_COL", Timestamp.valueOf("1950-01-26 12:30:30.300")},
				{"UROWID_COL", new String("000001F8.0001.0007")},{"VARCHAR2_COL", new String("Updated Varchar2")},
				{"input", new BigDecimal(i)}};
			T_row[i-start] = (IData)new Values(orow);
		}
		ValuesEmulator.put(pipeline,"inputs",T_row);
		// --- <<IS-END>> ---

                
	}
}

