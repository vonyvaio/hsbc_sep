package com.entity;

public class info {
	
	private String password;
	private String email;
	private String phone;
	private String name;
	
	public info () {
		
		password = name = phone = name = "";
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
	 * @return the phone
	 */
	
	public String getPhone() {
		
		return phone;
	}
	
	/**
	 * @param phone the phone to set
	 */
	
	public void setPhone(String phone) {
		
		this.phone = phone;
	}
	


}
