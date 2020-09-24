package com.dao;

import java.util.List;

import com.entity.Employee;

public interface DAOLayerInterface {

	public int createProfileDAO ( Employee e );
	
	public List < Employee > viewAllProfileDAO ();
	
	public int deleteProfileDAO ( Employee e );
	
	public int getIndex ( Employee e );
	
	public Employee ViewProfileDAO ( Employee e );
}
