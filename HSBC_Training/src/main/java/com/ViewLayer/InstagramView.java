package com.ViewLayer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.ControllerLayer.Instagram_Controller_Interface;
import com.utility.ControllerFactory;

public class InstagramView {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );	// for reading input
		int choice = 0;
		
		do {
			
			System.out.println ( "\n\n********************************* WELCOME TO INSTAGRAM *********************************" );
			System.out.println ( "Enter 0 to Exit" );
			System.out.println ( "Enter 1 to Create Profile" );
			System.out.println ( "Enter 2 to Delete Profile" );
			System.out.println ( "Enter 3 to View Profile" );
			System.out.println ( "Enter 4 to Search Profile" );
			System.out.println ( "Enter 5 to viewAll profile ");
			System.out.println ( "Enter 6 to Edit profile ");
			System.out.println ( "Enter 7 to View Complete Profile History ");
						
			System.out.println ( "Enter your choice: " );
			choice = Integer.parseInt ( br.readLine() );
			
			
			Instagram_Controller_Interface is = ControllerFactory.createObject ( "admin" );
			
			
			switch ( choice ) {
			
			case 0: choice = 0;
					break;					
			
			case 1: is.createProfile ();
					break;
				
			case 2:	is.deleteProfile ();
					break;
				
			case 3:	is.viewProfile ();
					break;
					
			case 4:	is.searchProfile ();
					break;
					
			case 5:	is.viewAllProfile ();
					break;
					
			case 6:	is.editProfile ();
					break;
			
			case 7:	is.profileHistory ();
					break;
					
			case 8:	is.createProfileInFile ();
					break;
			
			case 9:	is.viewProfileFromFile ();
					break;
					
			default: System.out.println("Wwrong Choice.. Enter Again");
					 break;
			
			}
			
			
		} while ( choice != 0 );

	}

}
