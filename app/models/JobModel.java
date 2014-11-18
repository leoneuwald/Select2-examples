package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import objects.Select2Model;
import play.db.ebean.Model;

@Entity
public class JobModel extends Model implements Select2Model {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer iJob;
	private String name;
	private String description;

	public JobModel(Integer iJob, String name, String description) {
		this.iJob = iJob;
		this.name = name;
		this.description = description;
	}

	public JobModel(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Integer getIJob() {
		return iJob;
	}

	public void setIJob(Integer iJob) {
		this.iJob = iJob;
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
		return getIJob().toString();
	}

}
