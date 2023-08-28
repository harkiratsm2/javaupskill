package com.hcl.taskmanager.to;

import java.time.LocalDate;

public class TaskTO {

	private String description;
	private LocalDate assignedDate;
	private String status;
	private String resolution;

	public TaskTO() {
		super();
	}

	public TaskTO(String description, LocalDate assignedDate, String status, String resolution) {
		super();
		this.description = description;
		this.assignedDate = assignedDate;
		this.status = status;
		this.resolution = resolution;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(LocalDate assignedDate) {
		this.assignedDate = assignedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
