package com.entity;

public class Employee {
	
	private String name;
	private String password;
	private String email;
	private String address;
	
	
	public Employee () {
		
		name = password = email = address = null;
		
	} // end of constructor
	
	
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
	 * @return the password
	 */
	
	public String getPassword() {
		
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	
	/**
	 * @return the email
	 */
	
	public String getEmail() {
		
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		
		this.address = address;
	}

} // end of Employee
