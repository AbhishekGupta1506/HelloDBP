/**
 * 
 */
package com.webmethods.caf.deploytesttaskinboxresults;

/**
 * @author ronw
 *
 */
public class DeployTestTaskInboxResultsEditviewView extends com.webmethods.caf.faces.bean.search.BaseSearchResultOptionsPageBean {

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.deploytesttaskinboxresults.DeployTestTaskInboxResults deployTestTaskInboxResults = null;

	/**
	 * @return
	 */
	protected String getSearchResultControlId() {
		return "searchResultsTableControl";
	}

	public com.webmethods.caf.deploytesttaskinboxresults.DeployTestTaskInboxResults getDeployTestTaskInboxResults()  {
		if (deployTestTaskInboxResults == null) {
		    deployTestTaskInboxResults = (com.webmethods.caf.deploytesttaskinboxresults.DeployTestTaskInboxResults)resolveExpression("#{DeployTestTaskInboxResults}");
		}
		return deployTestTaskInboxResults;
	}

}