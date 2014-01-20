package com.example.ppl2ppl;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

public class FileUpload implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File file;
	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	
	
	public File getFile() {
		return file;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String propose(){
		String response = "Failed!";
		System.out.println(response);
		return response;
				
	}
	
	
}
