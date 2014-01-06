/*
 * This class represent a User
 */
public class User {
	
  private String name;
  private String password;
  
  /**
   * @return name
   */
  public String getName() {
    return name;
  }
  
  /**
   * This method sets the name
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
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }
  
  /**
   * This method is unused maybe
   * @return
   */
  public String login(){
    // Image here a database access to validate the users
    if (name.equalsIgnoreCase("tester") && password.equalsIgnoreCase("tester")){
      return "success";
    } else {
      return "failed";
    }    
  } 
} 