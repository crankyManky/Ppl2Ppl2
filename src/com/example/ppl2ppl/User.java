package com.example.ppl2ppl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/*
 * This class represent a User
 */
@ManagedBean(name="user")
@RequestScoped
public class User {

	private String name;
	private String password;
	ResultSet rsName = null;
	ResultSet rsPW = null;
	
	private String dbRole;
	private String outputMsg;
	private String dbUserName;
	

	Statement statement = null;
	ResultSet result = null;
	Connection connect;

	public String login() {

		connect = null;

		try {
			System.out.println("Im Try-Block");
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver-Class!");
			return ("No Driver-Class!");
		}
		try {
			connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ppl2ppldb", "root", "admin");
			String sqlQueryName = "SELECT * FROM user(name)";
			String sqlQueryPW = "SELECT * FROM user(password)";
			System.out.println("Hier bin ich? Vor rsNAME?");
			rsName = statement.executeQuery(sqlQueryName);
			rsPW = statement.executeQuery(sqlQueryPW);
			if (name.equals(sqlQueryName) && password.equals(sqlQueryPW)) {
				outputMsg = "Hej hej " + name;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ("Bla");
//		// Image here a database access to validate the users
//		if (name.equalsIgnoreCase("tester")
//				&& password.equalsIgnoreCase("tester")) {
//			return "success";
//		} else {
//			return "failed";
//		}
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method sets the name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method sets the password
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method is unused maybe
	 * 
	 * @return
	 */

}