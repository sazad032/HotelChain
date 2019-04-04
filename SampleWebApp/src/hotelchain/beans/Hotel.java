package hotelchain.beans;

public class Hotel {
	
		String hotelID;
		String email_Address;
		int numRooms;
		float rating;
		String hotel_address;
		String phoneNumbers;
		String hotel_name;
	 
	   public Hotel() {
	 
	   }
	 
	   public Hotel(String hotelID, String email_Address,int numRooms,float rating, String hotel_address,String phoneNumbers,
			   String hotel_name) {
		   this.hotelID = hotelID;
		   this.email_Address = email_Address;
		   this.numRooms = numRooms;
		   this.rating = rating;
		   this.hotel_address = hotel_address;
		   this.hotel_name = hotel_name;
		   this.phoneNumbers = phoneNumbers;
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
	 * @return the hotel_address
	 */
	public String getHotel_address() {
		return hotel_address;
	}

	/**
	 * @param hotel_address the hotel_address to set
	 */
	public void setHotel_address(String hotel_address) {
		this.hotel_address = hotel_address;
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

	/**
	 * @return the hotel_name
	 */
	public String getHotel_name() {
		return hotel_name;
	}

	/**
	 * @param hotel_name the hotel_name to set
	 */
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	
	   
	   
	   
}
