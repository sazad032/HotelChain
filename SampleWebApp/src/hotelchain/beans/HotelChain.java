package hotelchain.beans;

public class HotelChain {

	
	String name;
	String hotelAddress;
	int numHotels;
	String emailAddress;
	String phoneNumbers;
 
   public HotelChain() {
 
   }
 
   public HotelChain(String name, String hotelAddress,int numHotels,String emailAddress,String phoneNumbers)
   {
	   this.name = name;
	   this.hotelAddress = hotelAddress;
	   this.numHotels = numHotels;
	   this.emailAddress = emailAddress;
	   this.phoneNumbers = phoneNumbers;

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
	 * @return the hotelAddress
	 */
	public String getHotelAddress() {
		return hotelAddress;
	}
	
	/**
	 * @param hotelAddress the hotelAddress to set
	 */
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	
	/**
	 * @return the numHotels
	 */
	public int getNumHotels() {
		return numHotels;
	}
	
	/**
	 * @param numHotels the numHotels to set
	 */
	public void setNumHotels(int numHotels) {
		this.numHotels = numHotels;
	}
	
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	/**
	 * @return the phoneNumbers
	 */
	public String getPhoneNumbers() {
		return phoneNumbers;
	}
	
	/**
	 * @param phoneNumbers the phoneNumbers to set
	 */
	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
   
   
}
