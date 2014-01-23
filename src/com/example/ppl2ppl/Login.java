package com.example.ppl2ppl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;



@ManagedBean(name="login")
@SessionScoped
public class Login {

	final String userName = "Peter";
	private String password;
	ResultSet rsName = null;
	ResultSet rsPW = null;
	private String dbUserName;
	private String dbPassword;
	private String dbRole;
	private String outputMsg;
	
	Statement statement = null;
	ResultSet result = null;
	
	public String databaseQuery(){
		
		Connection connect = null;
		try {
			System.out.println("Im Try-Block");
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver-Class!");
			return ("No Driver-Class!");
		}
		try {
			connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ppl2ppldb", "root",
					"admin");	
			String sqlQueryName = "SELECT * FROM user(name)";
			String sqlQueryPW = "SELECT * FROM user(password)";
			rsName = statement.executeQuery(sqlQueryName);
			rsPW = statement.executeQuery(sqlQueryPW);
			if(dbUserName.equals(sqlQueryName) && password.equals(sqlQueryPW)){
				outputMsg = "Hej hej " + dbUserName;  			
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ("Bla");
	}

	/**
	 * @return output_msg
	 */
	public String getOutput_msg() {
		return outputMsg;
	}


	/**
	 * This method sets the output_msg
	 * @param output_msg
	 */
	public void setOutput_msg(String output_msg) {
		this.outputMsg = output_msg;
	}


	/**
	 * @return userName
	 */
	public String getUsername() {
		return userName;
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
	 * @return dbUserName
	 */
	public String getDbUserName() {
		return dbUserName;
	}

	/**
	 * This method sets the dbUserName
	 * @param dbusername
	 */
	public void setDbusername(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	/**
	 * @return dbPassword
	 */
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * This method sets the dbPassword
	 * @param dbpassword
	 */
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	/**
	 * @return dbrole
	 */
	public String getDbrole() {
		return dbRole;
	}

	/**
	 * This method sets the dbRole
	 * @param dbrole
	 */
	public void setDbrole(String dbRole) {
		this.dbRole = dbRole;
	}

//	/**
//	 * This method ...
//	 * @param u
//	 * @param p
//	 * @throws SQLException
//	 */
//	public void dbData(String u, String p) throws SQLException {
//	//	DBClass t = new DBClass();
//		String sql1 = "select * from users where username like ('" + u
//				+ "') and password like ('" + p + "') ";
//		// String
//		// sql2="select * from user_roles where username like ('"+u+"') ";
//	//	rs = t.doQuery(sql1);
//		rs.next();
//		dbUserName = rs.getString(1);
//		dbPassword = rs.getString(2);
//		/*
//		 * rs1=t.doQuery(sql2); rs1.next(); dbrole=rs1.getString(2);
//		 */
//	}

//	/**
//	 * This method ...
//	 * @param u
//	 * @throws SQLException
//	 */
//	public void dbData1(String u) throws SQLException {
//	//	DBClass t = new DBClass();
//		String sql1 = "select * from user_roles where username like ('" + u
//				+ "')";
//		// String
//		// sql2="select * from user_roles where username like ('"+u+"') ";
//	//	rs = t.doQuery(sql1);
//		rs.next();
//		// dbusername=rs.getString(1);
//		dbRole = rs.getString(2);
//		/*
//		 * rs1=t.doQuery(sql2); rs1.next(); dbrole=rs1.getString(2);
//		 */
//	}

//	/**
//	 * This method compares userName & password with the given Input
//	 * @return
//	 * @throws SQLException
//	 */
//	public String checkUser() throws SQLException {
//		dbData(userName, password);
//		dbData1(userName);
//		if (userName.equals(dbUserName) && password.equals(dbPassword)
//				&& dbRole.equalsIgnoreCase("admin")) {
//			return "admin";
//		}
//		else if (userName.equals(dbUserName) && password.equals(dbPassword)
//				&& dbRole.equalsIgnoreCase("customer")) {
//			return "customer";
//		} else if (userName.equals(dbUserName) && password.equals(dbPassword)
//				&& dbRole.equalsIgnoreCase("employee")) {
//			return "employee";
//		} else
//			return "failure";
//	}
//	
	
}
