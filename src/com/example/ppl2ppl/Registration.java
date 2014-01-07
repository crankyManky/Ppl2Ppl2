package com.example.ppl2ppl;

import java.sql.Date;

public class Registration{
	
	private int idUser;
	private String preName;
	private String name;
	private String mail;
	private String password;
	private String street;
	private String zip;
	private String city;
	private String country;
	private Date regDate;
	
	/**
	 * Creates a new Instance of Registration
	 */
	public Registration(){
	}
	
	/**
	 * @return idUser
	 */
	public int getIdUser() {
		return idUser;
	}
	
	/**
	 * This method sets the idUser
	 * @param idUser
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return preName
	 */
	public String getPreName() {
		return preName;
	}

	/**
	 *This method sets the preName
	 * @param preName
	 */
	public void setPreName(String preName) {
		this.preName = preName;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method sets the Name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** 
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * This method sets the mail-adress
	 * @param mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method sets the password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * This method sets the street
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * This method sets the zip
	 * @param zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * This method sets the city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * This method sets the country
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return regDate
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * This method sets the regDate
	 * @param regDate
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}

