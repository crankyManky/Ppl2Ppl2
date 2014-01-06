
public class Registration{
	
	private int idUser;
	private String preName;
	private String name;
	private char mail;
	private char password;
	private char street;
	private char zip;
	private String city;
	private String country;
	
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
	public char getMail() {
		return mail;
	}

	/**
	 * This method sets the mail-adress
	 * @param mail
	 */
	public void setMail(char mail) {
		this.mail = mail;
	}

	/**
	 * @return password
	 */
	public char getPassword() {
		return password;
	}

	/**
	 * This method sets the password
	 * @param password
	 */
	public void setPassword(char password) {
		this.password = password;
	}

	/**
	 * @return street
	 */
	public char getStreet() {
		return street;
	}

	/**
	 * This method sets the street
	 * @param street
	 */
	public void setStreet(char street) {
		this.street = street;
	}

	/**
	 * @return zip
	 */
	public char getZip() {
		return zip;
	}

	/**
	 * This method sets the zip
	 * @param zip
	 */
	public void setZip(char zip) {
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
}
