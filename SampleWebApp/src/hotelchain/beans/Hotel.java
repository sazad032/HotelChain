package hotelchain.beans;

public class Hotel {
	
		String hotelID;
		String email_Address;
		int numRooms;
		float rating;
		String city;
		String country;
		String province;
		String streetName;
		int streetNumber;
		String postalCode;
		String phoneNumber;
	 
	   public Hotel() {
	 
	   }
	 
	   public Hotel(String hotelID, String email_Address,int numRooms,float rating, String city,String country,
		String province,String streetName,int streetNumber,	String postalCode,String phoneNumber) {
		   this.hotelID = hotelID;
		   this.email_Address = email_Address;
		   this.numRooms = numRooms;
		   this.rating = rating;
		   this.city = city;
		   this.country = country;
		   this.province = province;
		   this.streetName = streetName;
		   this.streetNumber = streetNumber;
		   this.postalCode = postalCode;
		   this.phoneNumber = phoneNumber;
	   }

	/**
	 * @return the hotelID
	 */
	public String getHotelID() {
		return hotelID;
	}

	/**
	 * @param hotelID the hotelID to set
	 */
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	/**
	 * @return the email_Address
	 */
	public String getEmail_Address() {
		return email_Address;
	}

	/**
	 * @param email_Address the email_Address to set
	 */
	public void setEmail_Address(String email_Address) {
		this.email_Address = email_Address;
	}

	/**
	 * @return the numRooms
	 */
	public int getNumRooms() {
		return numRooms;
	}

	/**
	 * @param numRooms the numRooms to set
	 */
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}

	/**
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the streetNumber
	 */
	public int getStreetNumber() {
		return streetNumber;
	}

	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	   
	   
	   
}
