package com.example.ppl2ppl;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idProject;

	@Lob
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	public Project() {
	}

	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}