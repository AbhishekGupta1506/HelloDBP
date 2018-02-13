/**
 * 
 */
package com.webmethods.caf.deploytesttaskoverview;

/**
 * @author ronw
 *
 */

import javax.faces.application.FacesMessage;
import com.webmethods.caf.faces.data.task.TaskDisplayProvider;

public class DeployTestTaskOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{DeployTestTaskOverview.taskID}" }, };
	private com.webmethods.caf.deploytesttaskoverview.DeployTestTaskOverview deployTestTaskOverview = null;
	private com.webmethods.caf.taskclient.DeployTestTask deployTestTask = null;
	private static final String[][] DEPLOYTESTTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{DeployTestTask.taskID}", "#{DeployTestTaskOverview.taskID}"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);

			return OUTCOME_OK;
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR; 
		}	
	}

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public com.webmethods.caf.deploytesttaskoverview.DeployTestTaskOverview getDeployTestTaskOverview()  {
		if (deployTestTaskOverview == null) {
		    deployTestTaskOverview = (com.webmethods.caf.deploytesttaskoverview.DeployTestTaskOverview)resolveExpression("#{DeployTestTaskOverview}");
		}
		return deployTestTaskOverview;
	}

	public com.webmethods.caf.taskclient.DeployTestTask getDeployTestTask()  {
		if (deployTestTask == null) {
		    deployTestTask = (com.webmethods.caf.taskclient.DeployTestTask)resolveExpression("#{DeployTestTask}");
		}
	
	    resolveDataBinding(DEPLOYTESTTASK_PROPERTY_BINDINGS, deployTestTask, "deployTestTask", false, false);
		return deployTestTask;
	}

}