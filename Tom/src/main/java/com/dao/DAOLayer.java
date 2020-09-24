package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;

public class DAOLayer implements DAOLayerInterface {

	private List < Employee > employee_data;
	
	public DAOLayer () {
		
		employee_data = new ArrayList < Employee > ();
		
	} // end of constructor
	
	
	@Override
	public int getIndex ( Employee e ) {
		
		int i = 0; // start index
		
			// search for employee and retrieve the index
		
		for ( Employee o : employee_data ) {
			
			if ( o.getName ().equals ( e.getName () ) && o.getPassword ().equals ( e.getPassword () ) ) {
				
				return i;
			}
			
			i++;
		}
		
		return -1; // for not found
	}
	
	
	@Override
	public List < Employee > viewAllProfileDAO () {
		
		return employee_data;
		
	} // end of viewAllProfileDAO Function
	
	
	@Override
	public int createProfileDAO ( Employee e ) {

		
		if ( employee_data.add ( e ) ) {
			
			return 1; // return 1 on successful addition
		}
				
		
		return 0;	// return 0 if failed
	
	} // end of createProfile class

	
	@Override
	public int deleteProfileDAO ( Employee e ) {
		
			// get index
		
		int i = getIndex ( e );
		
		if ( i != -1 ) {
			
			employee_data.remove ( i );
			
			return 1; // on successful deletion
		}
		
		return 0; // if can't be deleted
	}


	@Override
	public Employee ViewProfileDAO ( Employee e ) {
		
		int i = getIndex ( e );
		
		if ( i != -1 ) {
			
			return employee_data.get ( i );
		}
		
		return null; // return if unsuccessfull
		
	} // end of viewProfileDAO function
	
} // end of DAOLayer Class

