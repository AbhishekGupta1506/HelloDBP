/**
 * 
 */
package com.webmethods.caf.test;

/**
 * @author Eric Norman
 *
 */

import javax.portlet.PortletPreferences;

public class Test  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.DeployTestApp deployTestApp = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Test() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public com.webmethods.caf.DeployTestApp getDeployTestApp()  {
		if (deployTestApp == null) {
		    deployTestApp = (com.webmethods.caf.DeployTestApp)resolveExpression("#{DeployTestApp}");
		}
		return deployTestApp;
	}
}