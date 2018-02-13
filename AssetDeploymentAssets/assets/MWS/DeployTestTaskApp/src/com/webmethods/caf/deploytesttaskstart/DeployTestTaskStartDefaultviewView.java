/**
 * 
 */
package com.webmethods.caf.deploytesttaskstart;

/**
 * @author ronw
 *
 */

import javax.faces.application.FacesMessage;
import java.text.MessageFormat;

public class DeployTestTaskStartDefaultviewView extends com.webmethods.caf.faces.bean.task.BaseTaskStartPageBean {


	

	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.faces.data.object.TableSelectItemGroupProvider taskPriorityMapProvider = null;
	private static final String[][] TASKPRIORITYMAPPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskPriorityMapProvider.labelFieldName}", "label"},
		{"#{TaskPriorityMapProvider.array}", "#{TaskDisplayProvider.taskPriorityItems}"},
		{"#{TaskPriorityMapProvider.valueFieldName}", "value"},
	}; 
	public com.webmethods.caf.faces.data.object.TableSelectItemGroupProvider getTaskPriorityMapProvider()  {
		if (taskPriorityMapProvider == null) {
		    taskPriorityMapProvider = (com.webmethods.caf.faces.data.object.TableSelectItemGroupProvider)resolveExpression("#{TaskPriorityMapProvider}");
		}
	    resolveDataBinding(TASKPRIORITYMAPPROVIDER_PROPERTY_BINDINGS, taskPriorityMapProvider, null, false, true);
		return taskPriorityMapProvider;
	}

    /**
     * Queue new task. 
     * If successful adds INFO message to the faces context.
     * If failed adds error messages to the faces context.
     */
	public String queueNewTask() {
		try {
			// do the work
			getDeployTestTask().queueNewTask();

			
			
			

			String msgHeader = "The new task has been successfully started"; //start.task.pagebean.task.start.msg
			String msgText = "Task ID is {0}";									//start.task.pagebean.task.is.msg
			getFacesContext().addMessage(null, new FacesMessage(
				FacesMessage.SEVERITY_INFO, 
				msgHeader, 
				MessageFormat.format( msgText, new Object[] {getDeployTestTask().getTaskID()})));

			return OUTCOME_OK; 
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR; 
		}	
	}
	
   /**
	 * Go to the URL specified by the 'returnURL' preference
	 */
	public String doReturnURL() {
		try {
			// just redirect to return (finish) url
			String returnURL = (String)getDeployTestTaskStart().getReturnUrl();
			if (returnURL != null && returnURL.length() > 0) {
				getFacesContext().getExternalContext().redirect(returnURL);
			}
			return OUTCOME_OK;
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR; 
		}
	}
	
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
	};
	private com.webmethods.caf.deploytesttaskstart.DeployTestTaskStart deployTestTaskStart = null;
	private com.webmethods.caf.taskclient.DeployTestTask deployTestTask = null;
	private static final String[][] DEPLOYTESTTASK_PROPERTY_BINDINGS = new String[][] {
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

	public com.webmethods.caf.deploytesttaskstart.DeployTestTaskStart getDeployTestTaskStart()  {
		if (deployTestTaskStart == null) {
		    deployTestTaskStart = (com.webmethods.caf.deploytesttaskstart.DeployTestTaskStart)resolveExpression("#{DeployTestTaskStart}");
		}
		return deployTestTaskStart;
	}

	public com.webmethods.caf.taskclient.DeployTestTask getDeployTestTask()  {
		if (deployTestTask == null) {
		    deployTestTask = (com.webmethods.caf.taskclient.DeployTestTask)resolveExpression("#{DeployTestTask}");
		}
	
	    resolveDataBinding(DEPLOYTESTTASK_PROPERTY_BINDINGS, deployTestTask, "deployTestTask", false, false);
		return deployTestTask;
	}

}