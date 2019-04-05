package hotelchain.beans;

import java.sql.Date;

public class Customer {
 
   public static final String GENDER_MALE ="M";
   public static final String GENDER_FEMALE = "F";
    
   private String name;
   private String gender;
   private String password;
   private String sin;
   private Date date;
   
    
 
   public Customer() {
        
   }
    
   
 
   /**
 * @return the name
 */
public String getName() {
	return name;
}



/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}



	/**
	 * @return the sin
	 */
	public String getSin() {
		return sin;
	}
	
	
	
	/**
	 * @param sin the sin to set
	 */
	public void setSin(String sin) {
		this.sin = sin;
	}
	
	
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	
	
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}



	public String getGender() {
       return gender;
	}
 
	public void setGender(String gender) {
       this.gender = gender;
	}
 
	public String getPassword() {
       return password;
	}
 
	public void setPassword(String password) {
       this.password = password;
	}
 
}