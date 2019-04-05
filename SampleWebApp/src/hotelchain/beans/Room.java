package hotelchain.beans;



public class Room {
	String roomNum;
	double price;
	String view;
	boolean extendable;
	String capacity;
	String ammenities;
	String damages;
	String hotelID;
	String status;
	
	public Room() {
		
	}
	
	public Room(String roomNum, double price, String view, boolean extendable, String capacity,String ammenities, String damages, String hotelID,String status) {
		this.roomNum = roomNum;
		this.price = price;
		this.view = view;
		this.extendable = extendable;
		this.capacity = capacity;
		this.ammenities = ammenities;
		this.damages = damages;
		this.hotelID = hotelID;
		this.status = status;
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
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the view
	 */
	public String getView() {
		return view;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(String view) {
		this.view = view;
	}

	/**
	 * @return the extendable
	 */
	public boolean isExtendable() {
		return extendable;
	}

	/**
	 * @param extendable the extendable to set
	 */
	public void setExtendable(boolean extendable) {
		this.extendable = extendable;
	}

	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the damages
	 */
	public String getDamages() {
		return damages;
	}

	/**
	 * @param damages the damages to set
	 */
	public void setDamages(String damages) {
		this.damages = damages;
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
	 * @return the ammenities
	 */
	public String getAmmenities() {
		return ammenities;
	}

	/**
	 * @param ammenities the ammenities to set
	 */
	public void setAmmenities(String ammenities) {
		this.ammenities = ammenities;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
