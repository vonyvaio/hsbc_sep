package com.business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.dao.DAOLayerInterface;
import com.entity.Employee;
import com.factory.DAOFactory;

public class BusinessLayer implements BusinessLayerInterface {

	private DAOLayerInterface di;
	
	public BusinessLayer () {
		
		di = DAOFactory.createObject ();
	}
	
	
	@Override
	public void createProfile () {
		
		Employee e = new Employee ();
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		
			// taking data
		
		try {
		
			System.out.println ( "\nEnter Name: " );
			e.setName ( br.readLine () );
			
			System.out.println ( "Enter Password: " );
			e.setPassword ( br.readLine () );
			
			System.out.println ( "Enter Email: " );
			e.setEmail ( br.readLine () );
			
			System.out.println ( "Enter Address: " );
			e.setAddress ( br.readLine () );
		
		} catch ( IOException io ) {
			
			io.printStackTrace();
		
		}
		
		if ( di.createProfileDAO ( e ) == 1 ) { // call DAO Layer to add data
		
			System.out.println ( "Profle Created Successfully \n" );
		
		}else {
			
			System.out.println ( "Error in Creating Profle \n" );
		}
		
	} // end of create profile method


	@Override
	public void viewAllProfile () {
		
		List < Employee > employee_data = di.viewAllProfileDAO ();
		
		if ( employee_data.size () > 0 ) {
			
			for ( Employee o : employee_data ) {
				
				System.out.println ( "\nName: " + o.getName () );
				System.out.println ( "Password: " + o.getPassword () );
				System.out.println ( "Email: " + o.getEmail () );
				System.out.println ( "Address: " + o.getAddress () + "\n" );
			}
		}
		
	} // end of viewAll Function
	
	
	@Override
	public void deleteProfile () {
		
		Employee e = new Employee ();
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		
			// taking data
		
		try {
		
			System.out.println ( "\nEnter Name of profile to be deleted: " );
			e.setName ( br.readLine () );
			
			System.out.println ( "Enter Password of profile to deleted: " );
			e.setPassword ( br.readLine () );
			
		} catch ( IOException io ) {
			
			io.printStackTrace();		
		}
		
		if ( di.deleteProfileDAO ( e ) == 1 ) { // call DAO Layer to add data
		
			System.out.println ( "Profle Deleted Successfully \n" );
		
		}else {
			
			System.out.println ( "Profile Does Not Exists/ Error in Deleting Profle \n" );
		}
		
	} // end of deleteProfile


	@Override
	public void viewProfile() {
		
		Employee e = new Employee ();
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		
			// taking data
		
		try {
		
			System.out.println ( "\nEnter Name of profile to be Viewd: " );
			e.setName ( br.readLine () );
			
			System.out.println ( "Enter Password of profile to be Viewd: " );
			e.setPassword ( br.readLine () );
			
		} catch ( IOException io ) {
			
			io.printStackTrace();		
		}
		
		if ( ( e = di.ViewProfileDAO ( e ) ) != null ) { // call DAO Layer to add data
		
			System.out.println ( "Viewing Profle \n" );
			
			System.out.println ( "\nName: " + e.getName () );
			System.out.println ( "Password: " + e.getPassword () );
			System.out.println ( "Email: " + e.getEmail () );
			System.out.println ( "Address: " + e.getAddress () + "\n" );
		
		}else {
			
			System.out.println ( "Profile Does Not Exists/ Error in Viewing Profle \n" );
		}
		
	}
	
} // end of class BusinessLayer
