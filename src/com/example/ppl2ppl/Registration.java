package com.example.ppl2ppl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Registration {

	@ManagedProperty(value="#{idUser}")
	private int idUser;
	@ManagedProperty(value="#{preName}")
	private String preName;
	@ManagedProperty(value="#{name}")
	private String name;
	@ManagedProperty(value="#{mail}")
	private String mail;
	@ManagedProperty(value="#{password}")
	private String password;
	@ManagedProperty(value="#{street}")
	private String street;
	@ManagedProperty(value="#{zip}")
	private String zip;
	@ManagedProperty(value="#{city}")
	private String city;
	@ManagedProperty(value="#{country}")
	private String country;
	@ManagedProperty(value="#{regDate}")
	private Date regDate;

	/**
	 * Creates a new Instance of Registration
	 */
	public Registration() {
	}

	/**
	 * @return idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * This method sets the idUser
	 * 
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
	 * This method sets the preName
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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
	 * 
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

	/**
	 * This method adds the data into the database
	 * @return
	 */
	public String sendInfosToDB() {
		System.out.println("bin ich drin?");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		int i = 0;
		System.out.println(dateFormat);

		if (idUser == 0) {
			PreparedStatement ps = null;
			Connection connect = null;
			try {
				System.out.println("Im Try-Block");
				Class.forName("com.mysql.jdbc.Driver");
				connect = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/ppl2ppldb",
								"root", "admin");
				String sql = "INSERT INTO user(idUser, prename, name, mail, password, street, zip, city, country, regDate) VALUES(?,?,?,?)";
				ps = connect.prepareStatement(sql);
				ps.setInt(1, idUser);
				ps.setString(2, preName);
				ps.setString(3, name);
				ps.setString(4, mail);
				ps.setString(5, password);
				ps.setString(6, street);
				ps.setString(7, zip);
				ps.setString(8, city);
				ps.setString(9, country);
				System.out.println("pushe");
				if (regDate != null) {
					String date = dateFormat.format(regDate);
					Object obj = date;
					if (obj == null) {
						ps.setDate(10, null);
					} else {
						java.sql.Date dateTime = java.sql.Date
								.valueOf(new String(date));
						ps.setDate(10, dateTime);
					}
				}

				i = ps.executeUpdate();
				System.out.println("Data added Successfully");
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					connect.close();
					ps.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (i > 0) {
				return "output";
			} else {
				return "invalid";
			}
		} else {
			return "invalid";
		}
	}
}
