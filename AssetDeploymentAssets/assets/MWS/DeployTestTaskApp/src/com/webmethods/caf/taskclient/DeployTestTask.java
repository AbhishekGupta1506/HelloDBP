package com.webmethods.caf.taskclient;


import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;

/**
 * Task Client bean for 'DeployTestTask' task.
 */
public class DeployTestTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 3292908158066060288L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "708F0279-CDEC-A308-F018-E90393A483AB";

	/**
	 * Default constructor
	 */
	public DeployTestTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 1715100672291970048L;
		
		private java.lang.String testField1;

		public static final String[] INPUTS = new String[] {"testField1", };

		public static final String[] OUTPUTS = new String[] {"testField1", };

		public TaskData() {
		}

		public java.lang.String getTestField1()  {
			
			return testField1;
		}

		public void setTestField1(java.lang.String testField1)  {
			this.testField1 = testField1;
		}
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}