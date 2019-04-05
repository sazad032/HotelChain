package hotelchain.beans;

public class Employee {
	String sin;
	String name;
	String role;
	String employee_address;
	String hoteID;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}


	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}


	/**
	 * @return the employee_address
	 */
	public String getEmployee_address() {
		return employee_address;
	}


	/**
	 * @param employee_address the employee_address to set
	 */
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}


	/**
	 * @return the hoteID
	 */
	public String getHoteID() {
		return hoteID;
	}


	/**
	 * @param hoteID the hoteID to set
	 */
	public void setHoteID(String hoteID) {
		this.hoteID = hoteID;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	public Employee() {
		
	}
	public Employee(String sin, String name, String role, String employee_address, String hotelId) {
		this.sin = sin;
		this.name = name;
		this.role = role;
		this.employee_address = employee_address;
		this.hoteID = hotelId;
	}



	
}
