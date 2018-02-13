/**
 * 
 */
package com.webmethods.caf.deploytesttaskview;

/**
 * @author ronw
 *
 */

import com.webmethods.caf.faces.data.dir.PrincipalModel;
import com.webmethods.caf.faces.data.dir.PrincipalModelList;
import com.webmethods.caf.faces.data.task.impl.TaskContentProvider;

import java.util.ArrayList;
import java.util.List;

public class DeployTestTaskViewDefaultviewView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.faces.data.task.TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskDisplayProvider.taskID}", "#{activePreferencesBean.taskID}"},
	};

	public com.webmethods.caf.faces.data.task.TaskDisplayProvider getTaskDisplayProvider()  {
		if (taskDisplayProvider == null) {
		    taskDisplayProvider = (com.webmethods.caf.faces.data.task.TaskDisplayProvider)resolveExpression("#{TaskDisplayProvider}");
		}
	    resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS, taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	/**
	 * Cancel button action handler
	 */
	public String cancelView() {
		try {
			// just redirect to return (finish) url
			String url = getDeployTestTaskView().getFinishUrl();
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
			return OUTCOME_OK;
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR; 
		}
	}
	
	/**
	 * Complete button action handler
	 */
	public String completeTask() {
		try {
			if( !getDeployTestTask().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return OUTCOME_ERROR; 
			}

			// do the work
			getDeployTestTask().completeTask(); 
		
			// then redirect to finish url
			String url = getDeployTestTaskView().getFinishUrl(); 
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}

			return OUTCOME_OK;
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR; 
		}
	}	

	/**
	 * Submit button action handler
	 */
	public String submitTask() {
		try {
			if( !getDeployTestTask().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return OUTCOME_ERROR; 
			}


			// do the work
			getDeployTestTask().applyChanges();

			return OUTCOME_OK;
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR; 
		}
	}

	private PrincipalModelList selectedPrincipalList;

	public PrincipalModelList getPrincipalList() {
		return selectedPrincipalList;
	}
	
	public void setPrincipalList(PrincipalModelList value) {
		this.selectedPrincipalList = value;
	}
	
	/**
	 * Action Event Handler for the control with id='dialogPrincipalAssignTo'
	 */
	public String assignToPrincipals() {
		try {

			// get the current assigned principals for this task
			TaskContentProvider tp = getDeployTestTask();

			List<String> currentPrincipalList = new ArrayList<String>();
			String[] currentPrincipalIDs = tp.getTaskInfo().getAssignedToList();
			if (currentPrincipalIDs != null && currentPrincipalIDs.length > 0) {
				for (int ix = 0; ix < currentPrincipalIDs.length; ix++) {
					String principalID = currentPrincipalIDs[ix];
					currentPrincipalList.add( principalID );
				}
			}
			
			// get the selected principals from the picker
			if (selectedPrincipalList != null && selectedPrincipalList.size() > 0) {
				// loop and add the selected principals to the existing list
				for (int ix = 0; ix < selectedPrincipalList.size(); ix++) {
					PrincipalModel principalModel = (PrincipalModel) selectedPrincipalList.get(ix);
					String principalID = principalModel.getPrincipalID(); 
					if( !currentPrincipalList.contains( principalID)) {
						currentPrincipalList.add( principalID );
					}
				}
			}
				
			currentPrincipalIDs = currentPrincipalList.toArray( currentPrincipalIDs);
			tp.getTaskInfo().setAssignedToList(currentPrincipalIDs);
			tp.applyChangesNoAccept();
				
			// then redirect to finish url
			//String url = getRonTask36TaskView().getFinishUrl(); 
			//if (url != null && url.length() > 0) {
			//	getFacesContext().getExternalContext().redirect(url);
			//}				
		} catch (Exception e) {
			error(e);
			log(e);
			return OUTCOME_ERROR;
		}		
		return OUTCOME_OK;
	}
	
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{DeployTestTask.reset}", null}
	};
	private com.webmethods.caf.deploytesttaskview.DeployTestTaskView deployTestTaskView = null;
	private com.webmethods.caf.taskclient.DeployTestTask deployTestTask = null;
	private static final String[][] DEPLOYTESTTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{DeployTestTask.taskID}", "#{DeployTestTaskView.taskID}"},
		{"#{DeployTestTask.autoAccept}", "false"},
		{"#{DeployTestTask.adhocRouting}", "false"},
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
	
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
	}

	public com.webmethods.caf.deploytesttaskview.DeployTestTaskView getDeployTestTaskView()  {
		if (deployTestTaskView == null) {
		    deployTestTaskView = (com.webmethods.caf.deploytesttaskview.DeployTestTaskView)resolveExpression("#{DeployTestTaskView}");
		}
		return deployTestTaskView;
	}

	public com.webmethods.caf.taskclient.DeployTestTask getDeployTestTask()  {
		if (deployTestTask == null) {
		    deployTestTask = (com.webmethods.caf.taskclient.DeployTestTask)resolveExpression("#{DeployTestTask}");
		}
	
	    resolveDataBinding(DEPLOYTESTTASK_PROPERTY_BINDINGS, deployTestTask, "deployTestTask", false, false);
		return deployTestTask;
	}
	
	
}