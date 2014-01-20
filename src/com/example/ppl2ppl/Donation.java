package com.example.ppl2ppl;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the donation database table.
 * 
 */
@Entity
public class Donation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDonation;

	private int amount;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	private int idProject;

	private int idUser;
	
	private int oneOrSplit;

	public Donation() {
	}

	public int getIdDonation() {
		return this.idDonation;
	}

	public void setIdDonation(int idDonation) {
		this.idDonation = idDonation;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getIdProject() {
		return this.idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the oneOrSplit
	 */
	public int getOneOrSplit() {
		return oneOrSplit;
	}

	/**
	 * @param oneOrSplit the oneOrSplit to set
	 */
	public void setOneOrSplit(int oneOrSplit) {
		this.oneOrSplit = oneOrSplit;
	}
	
	public void valueChangedSplit(){
		System.out.println("Value Changed");
		if(oneOrSplit == 1){
			//add some html-code for splitting donation
		}
	}

}