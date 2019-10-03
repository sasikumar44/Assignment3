package com.sgic.assignment.three;

public class Q4_3_Task {
	private String taskName;
	private String taskDuration;
	private String status;

	Q4_3_Task(String n, String d){
		this.taskName = n;
		this.taskDuration = d;
		this.status = "New";
	}	
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getTaskDuration() {
		return taskDuration;
	}

	public String getStatus() {
		return status;
	}

}
