package com.example.ppl2ppl;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * This class should upload files into the database
 * 
 * @author Julia Bergmayr & Patricia Mankowski
 */
public class FileUpload implements Serializable {

	private static final long serialVersionUID = 1L;
	private File file;
	private String title;
	private String description;
	private Date startDate;
	private Date endDate;
	
	/**
	 * With this method a user/admin can propose a new project
	 * @return
	 */
	public String propose(){
		String response = "Failed!";
		System.out.println(response);
		return response;			
	}	
	
	/**
	 * @return file
	 */
	public File getFile() {
		return file;
	}
	
	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	
	/**
	 * @return endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	
	/**
	 * This method sets the file
	 * 
	 * @param file
	 */
	public void setFile(File file) {
		this.file = file;
	}
	
	/**
	 * This method sets the title of a file
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * This method sets a description of a file
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * This method sets a startDate
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * This method sets a endDate
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
