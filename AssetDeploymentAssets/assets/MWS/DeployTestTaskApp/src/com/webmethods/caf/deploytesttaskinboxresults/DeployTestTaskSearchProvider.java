package com.webmethods.caf.deploytesttaskinboxresults;


/**
 * Task Search bean for 'DeployTestTask' task.
 */
public class DeployTestTaskSearchProvider extends com.webmethods.caf.faces.data.task.impl.TaskInboxSearchContentProvider {

	private static final long serialVersionUID = 8483864795825836032L;
	private static final String TASK_TYPE_ID = "708F0279-CDEC-A308-F018-E90393A483AB";

	public DeployTestTaskSearchProvider() {
		super(); // task type id to search
		m_searchQuery = new CustomInboxSearchQuery(); 
	}

	/**
	 * Typed ITaskData getter
	 * @return current task data
	 */
	public com.webmethods.caf.taskclient.DeployTestTask.TaskData getTaskData() {
		return (com.webmethods.caf.taskclient.DeployTestTask.TaskData)getValue(PROPERTY_TASKDATA);
	}

	/**
	 * Typed custom search query
	 */
	public CustomInboxSearchQuery getSearchQuery() {  
		return (CustomInboxSearchQuery)m_searchQuery;
	}

	/**
	 * Custom inbox search query that can be extended
	 **/
	public class CustomInboxSearchQuery extends com.webmethods.caf.faces.data.task.impl.TaskInboxSearchContentProvider.InboxSearchQuery {
		private static final long serialVersionUID = 7416363013591273472L;
		
		public CustomInboxSearchQuery() {
			super();
		}

	}				

}
