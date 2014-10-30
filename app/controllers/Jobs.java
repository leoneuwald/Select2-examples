package controllers;

import objects.Select2AbstractObject;

public class Jobs extends Select2AbstractObject {
	private Integer IJobs;
	private String name;
	private String description;

	public Jobs(Integer iJobs, String name, String description) {
		this.IJobs = iJobs;
		this.name = name;
		this.description = description;
	}

	public Integer getIJobs() {
		return IJobs;
	}

	public void setIJobs(Integer iJobs) {
		IJobs = iJobs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getId() {
		return IJobs.toString();
	}
}
