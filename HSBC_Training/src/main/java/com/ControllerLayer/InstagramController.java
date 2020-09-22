package com.ControllerLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.ServiceLayer.Instagram_Service_Interface;
import com.entity.InstagramUser;
import com.sort.*;
import com.utility.InstagramException;
import com.utility.ServiceFactory;

public class InstagramController implements Instagram_Controller_Interface {

	private Instagram_Service_Interface is;
	
	private BufferedReader br;
	
	private InstagramUser iu;
	
	public InstagramController () {
		
		is = ServiceFactory.createObject ( "admin" );
	}

	public void createProfileInFile () throws Exception {
		
		br = new BufferedReader ( new InputStreamReader ( System.in ) );
		iu = new InstagramUser ();
		
		try {
			
			System.out.println ( "Enter Name: " );
			iu.setName ( br.readLine () );
			
			System.out.println ( "Enter Password: " );
			iu.setPassword ( br.readLine () );
			
			System.out.println ( "Enter Email: " );
			iu.setEmail ( br.readLine () );
			
			System.out.println ( "Enter Address: " );
			iu.setAddress ( br.readLine () );
			
		} catch ( IOException io ) {
			
			io.printStackTrace ();			
		}
		
		if ( is.createProfileServiceInFile ( iu ) > 0 ) {
			
			System.out.println ( "Profile Created Successfully" );
		}
		
		else {
			
			System.out.println ( "Profile cannot be created... ERROR " );
		}
	}
	
	@Override
	public void createProfile() throws Exception {
		
		br = new BufferedReader ( new InputStreamReader ( System.in ) );
		iu  = new InstagramUser ();
		
		try {
		
			System.out.println ( "Enter Name: " );
			iu.setName ( br.readLine () );
			
			System.out.println ( "Enter Password: " );
			iu.setPassword ( br.readLine () );
			
			System.out.println ( "Enter Email: " );
			iu.setEmail ( br.readLine () );
			
			System.out.println ( "Enter Address: " );
			iu.setAddress ( br.readLine () );
		
		}
		catch ( IOException io ) {
			
			io.printStackTrace ();
		}
		
		if ( is.createProfileService ( iu ) > 0 ) {
		
			System.out.println ( "Profile Created Successfully" );
		}
		
		else {
			
			System.out.println ( "Profile cannot be created... ERROR " );
		}
		
	} // end of method
	
	@Override
	public void deleteProfile () throws Exception {
		
		br = new BufferedReader ( new InputStreamReader ( System.in ) );
		iu  = new InstagramUser ();
		
		System.out.println ( "Enter Name of your Profile to be Deleted: " );
		iu.setName ( br.readLine () );
		
		System.out.println ( "Enter Password of Profile to Delete: " );
		iu.setPassword ( br.readLine () );
			
		if ( is.deleteProfileService ( iu ) == 1 ) {
			
			System.out.println ( "\nProfile Deleted Successfully " );						
		}
		
		else {
			
			System.out.println ( "Unable To Delete Profile or Profile does not Exists " );
		}
		
	} // end of method
	
	@Override
	public void viewProfileFromFile () throws Exception {
		
		
	}
	
	@Override
	public void viewProfile () throws Exception {
		
		br = new BufferedReader ( new InputStreamReader ( System.in ) );
		iu  = new InstagramUser ();
		
		System.out.println ( "Enter Name of your Profile: " );
		iu.setName ( br.readLine () );
		
		System.out.println ( "Enter Password of Profile to View: " );
		iu.setPassword ( br.readLine () );
		
		InstagramUser return_data;	// variable to hold return data
		
		if ( (  return_data = is.viewProfileService ( iu ) ) != null ) {
			
			System.out.println ( "\nViewing Profile " );
			
			System.out.println ( "Name: " + return_data.getName () );
			System.out.println ( "Email: " + return_data.getEmail () );
			System.out.println ( "Address: " + return_data.getAddress () + "\n" );			
		}
		
		else {
			
			System.out.println ( "Unable To View Profile Or Profile Does Not Exists " );
		}		
		
	} // end of method
	
	@Override
	public void searchProfile () throws Exception {
		
		br = new BufferedReader ( new InputStreamReader ( System.in ) );
		iu  = new InstagramUser ();
		
		System.out.println ( "Enter Name: " );
		iu.setName ( br.readLine () );
		
		List <InstagramUser> return_data;	// variable to hold return data
		
		if ( ( return_data = is.searchProfileService ( iu ) ).size () > 0 ) {
			
			System.out.println ( "Profile Search Successfull" );
			System.out.println ( "\nViewing All Profile" );
			
			for ( InstagramUser oo : return_data ) {
			
				System.out.println ( "Name: " + oo.getName () );
				System.out.println ( "Email: " + oo.getEmail () );
				System.out.println ( "Address: " + oo.getAddress () + "\n" );
			
			}
		}
		else {
			
			System.out.println ( "Search Profile Does Not Exists " );
		}		
		
	} // end of method

	@Override
	public void viewAllProfile () throws Exception {
		
		br = new BufferedReader ( new InputStreamReader ( System.in ) );
		iu  = new InstagramUser ();
		
		List <InstagramUser> return_data;	// variable to hold return data
		
		if ( ( return_data = is.viewAllProfileService () ).size () > 0 ) {
			
			System.out.println ( "\nEnter 1 to sort records by Name: " );
			System.out.println ( "Enter 2 to sort records by Email: " );
			System.out.println ( "Enter 3 to sort records by Address: " );
			System.out.println ( "Enter 4 to View as it is: " );
			System.out.println ( "Enter you choice: " );
			
			System.out.println ( "\nViewing All Profile" );
			
			int choice = Integer.parseInt( br.readLine () );
			
			switch ( choice ) {
			
			case 1: Collections.sort ( return_data, new SortByName () );					
					break;
					
			case 2: Collections.sort ( return_data, new SortByEmail () );					
					break;	
			
			case 3: Collections.sort ( return_data, new SortByAddress () );					
					break;	
					
			default: break;
			
			}
			
			for ( InstagramUser oo : return_data ) { displayProfile ( oo ); }
		}
		
		else {
			
			System.out.println ( "Error Viewing All Profile" );
		}		
		
	} // end of method

	public void editProfile () throws InstagramException, Exception {
		
		try {
	
			br = new BufferedReader ( new InputStreamReader ( System.in ) );
			iu  = new InstagramUser ();
			
			System.out.println ( "Enter Name of your Profile to EDIT: " );
			iu.setName ( br.readLine () );
			
			System.out.println ( "Enter Password of Profile to EDIT: " );
			iu.setPassword ( br.readLine () );
		
			if ( ( iu = is.verifyProfileService ( iu ) ) != null ) {		
				
				displayProfile ( iu );
				
				int choice = 0;			
							
				// give options to user for editing
				
				do {
					
					System.out.println ( "\n\n\t********************************* WELCOME TO EDIT MENU *********************************" );
					System.out.println ( "\tEnter 0 to Exit" );
					System.out.println ( "\tEnter 1 to Edit Name" );
					System.out.println ( "\tEnter 2 to Edit Password" );
					System.out.println ( "\tEnter 3 to Edit Email" );
					System.out.println ( "\tEnter 4 to Address" );
					
					System.out.println ( "\tEnter Your Choice: " );
					choice = Integer.parseInt ( br.readLine () );
					
					InstagramUser nis = new InstagramUser ();
					
					switch ( choice ) {
					
						case 0: choice = 0;
								break;					
			
						case 1: System.out.println ( "Enter New Name: " );
								nis.setName ( br.readLine () );
								iu = is.editProfileService ( nis, iu, 1 );
								break;
				
						case 2:	System.out.println ( "Enter New Password: " );
								nis.setPassword ( br.readLine () );
								iu = is.editProfileService ( nis, iu, 2 );
								break;
				
						case 3:	System.out.println ( "Enter New Email: " );
								nis.setEmail ( br.readLine () );
								iu = is.editProfileService ( nis, iu, 3 );	
								break;
					
						case 4:	System.out.println ( "Enter New Address: " );
								nis.setAddress ( br.readLine () );
								iu = is.editProfileService ( nis, iu, 4 );
								break;
					
						default: System.out.println("Wwrong Choice.. Enter Again");
								 break;
					}
					
					System.out.println ( "\nUPDATED PROFILE\n" );
					displayProfile ( iu );
					
				} while ( choice != 0 );
			}
			
			else {
				
				System.out.println ( "Login Failed" );
			}
		
		}		
		catch ( IOException io ) {
			
			io.printStackTrace ();			
		}
		catch ( InstagramException ie ) {
			
			System.out.println ( ie.toString () );
		}
		
	}
	
	@Override
	public void displayProfile ( InstagramUser iu ) {
		
		System.out.println ( "\nName: " + iu.getName () );
		
		System.out.println ( "Password: " + iu.getPassword () );
		
		System.out.println ( "Email: " + iu.getEmail () );
		
		System.out.println ( "Address: " + iu.getAddress () + "\n" );	
	}

	public void profileHistory () throws Exception {
		
		Map < String, List < InstagramUser > > history = is.profileHistoryService ();
		
		List < InstagramUser > user = history.get ( "a" );
		
		for ( InstagramUser u : user ) {
			
			displayProfile ( u );
		}
		
		user = history.get ( "b" );
		
		for ( InstagramUser u : user ) {
			
			displayProfile ( u );
		}
	}

}
