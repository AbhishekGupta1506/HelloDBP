package com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl;


import com.webmethods.caf.faces.data.ws.glue.GlueWSClientContentProvider;

/**
 * Glue Web Service Client bean generated for 
 * com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.IaddInts_PortType.addInts.
 */
public class AddInts extends GlueWSClientContentProvider {

	private static final long serialVersionUID = 5670384177464069120L;

	/**
	 * Default constructor
	 */
	public AddInts() {
		super(com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.IaddInts_PortType.class, // port type proxy class
			"addInts", // method to invoke
			new String[] { "addIntsInput",  "addIntsInput", }, // method parameter names
			new Class[] { com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsInput.class,  com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsInput.class, } // method parameter types
		);
		// wsdl and maps by are saved in the same package
		setWsdlUrl("classpath:addIntsWSDL.wsdl");
		setMapUrls(new String[] { "classpath:addIntsWSDL.map", });

		// init wsclient
		initParams();
		
		// parameters bean
		parameters = new Parameters();
		
		// complex output, just a place holder
		result = new com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsOutput();
		
	}
	
	
	/**
	 * Method parameters bean
	 */
	public class Parameters  implements java.io.Serializable {

		private static final long serialVersionUID = 1266280672218989568L;

		public Parameters() {
		}
	
		private com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsInput addIntsInput  = new  com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsInput() ;

		public com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsInput getAddIntsInput() {
			return addIntsInput;
		}

		public void setAddIntsInput(com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsInput addIntsInput) {
			this.addIntsInput = addIntsInput;
		} 	
		
	}
	
	
	
	/**
	 * Return method invocation parameters bean
	 */
	public Parameters getParameters() {
		return (Parameters)parameters;
	}	
	


	
	/**
	 * Return method invocation result
	 */
	public com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsOutput getResult() {
		return (com.webmethods.caf.is.wsclient.wmwebsrv.wsd.addintswsdl.addIntsOutput)result;
	}
	

		
}