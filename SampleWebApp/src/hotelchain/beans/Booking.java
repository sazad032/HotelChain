package hotelchain.beans;

import java.sql.Date;


public class Booking {
	String bookingID;
	Date startDate;
	Date endDate;
	String sin;
	String roomNum;
	Boolean rented;
	
	public Booking() {
		
	}
	
	public Booking(String bookingID, Date startDate, Date endDate, String sin, String roomNum, Boolean rented) {
		this.bookingID = bookingID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.sin = sin;
		this.roomNum = roomNum;
		this.rented = rented;
	}

	/**
	 * @return the bookingID
	 */
	public String getBookingID() {
		return bookingID;
	}

	/**
	 * @param bookingID the bookingID to set
	 */
	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	 * @return the roomNum
	 */
	public String getRoomNum() {
		return roomNum;
	}

	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	/**
	 * @return the rented
	 */
	public Boolean getRented() {
		return rented;
	}

	/**
	 * @param rented the rented to set
	 */
	public void setRented(Boolean rented) {
		this.rented = rented;
	}

}
