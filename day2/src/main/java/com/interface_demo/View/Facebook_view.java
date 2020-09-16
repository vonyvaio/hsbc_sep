package com.interface_demo.View;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.interface_demo.Controller.*;

public class Facebook_view {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );	// for reading input
		int choice = 0;
		
		do {
			
			System.out.println ( "\n\n********************************* WELCOME TO FACEBOOK *********************************" );
			System.out.println ( "Enter 0 to Exit" );
			System.out.println ( "Enter 1 to Create Profile" );
			System.out.println ( "Enter 2 to Delete Profile" );
			System.out.println ( "Enter 3 to View Profile" );
			System.out.println ( "Enter 4 to Search Profile" );
			System.out.println ( "Enter 5 to viewAll profile ");
						
			System.out.println ( "Enter your choice: " );
			choice = Integer.parseInt ( br.readLine() );
			
			
			Facebook_Controller_Interface fi = new FacebookController ();
			
			
			switch ( choice ) {
			
			case 0: choice = 0;
					break;					
			
			case 1: fi.createProfile();
					break;
				
			case 2:	fi.deleteProfile();
					break;
				
			case 3:	fi.viewProfile();
					break;
					
			case 4:	fi.searchProfile();
					break;
					
			case 5:	fi.viewAllProfile();
					break;
					
			default: System.out.println("Wwrong Choice.. Enter Again");
					 break;
			
			}
			
			
		} while ( choice != 0 );

	}

}
