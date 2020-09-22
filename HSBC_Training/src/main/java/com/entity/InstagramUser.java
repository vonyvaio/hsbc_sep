package com.entity;

public class InstagramUser {

	private String name;
	private String password;
	private String email;
	private String address;
	
	public InstagramUser () {
		
		name = null;
		password = null;
		email = null;
		address = null;
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		InstagramUser other = (InstagramUser) obj;
		
		if (address == null) {
			
			if (other.address != null)
				return false;
			
		} else if (!address.equals(other.address))
			return false;
				
		if (email == null) {
			
			if (other.email != null)
				return false;
			
		} else if (!email.equals(other.email))
			return false;
		
		
		if (name == null) {
			
			if (other.name != null)
				return false;
			
		} else if (!name.equals(other.name))
			return false;
		
		
		if (password == null) {
			
			if (other.password != null)
				return false;
			
		} else if (!password.equals(other.password))
			return false;
		
		
		return true;
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
	
	
	
}
