package com.example.ppl2ppl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * This class represents a user and the function login
 * @author Julia Bergmayr & Patricia Mankowski
 */
@ManagedBean(name = "user")
@SessionScoped
public class User {

	public User() {
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	private String name;
	private String password;
	ResultSet rsName = null;

	Statement statement = null;
	ResultSet result = null;
	Connection connect;
	User nUser;
	String outputMessage;
	

	List<User> users = new ArrayList<User>();

	/**
	 * This method checks if the user is registered and handle the user
	 * according to this
	 * 
	 * @return
	 */
	public String login() {

		connect = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			return ("No Driver-Class!");
		}
		try {
			connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ppl2ppldb", "root", "admin");
			statement = connect.createStatement();
			String sqlQueryName = "SELECT * FROM user";

			result = statement.executeQuery(sqlQueryName);
			result.first();
			while (!result.isAfterLast()) {
				String name = result.getString("name");
				String pw = result.getString("password");

				nUser = new User(name, pw);
				users.add(nUser);
				result.next();
			}
			if (name.equals(nUser.name) && password.equals(nUser.password)) {
				System.out.println("if-else - should go to the next page");
				return "../com.example.ppl2ppl/LoginSuccessed.xhtml";
			} else {
				System.out.println("Inputs are wrong! Please try again.");
				outputMessage = "Your inputs are wrong. If you really registered - try again!";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ("Bla");
	}
	
	/**
	 * This method need a user to logout himself
	 * @return
	 */
	public String logout() {
		
		return "I need a logout!";
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
}