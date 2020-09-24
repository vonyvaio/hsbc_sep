package com.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.business.BusinessLayerInterface;
import com.factory.BusinessFactory;

public class ViewLayer {

	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );	// for reading input
		
		int choice = 0;
		
		BusinessLayerInterface bi = BusinessFactory.createObject (); // get business layer object
		
		
			// provide choice to user
		
		do {
			
			System.out.println ( "\n********************* MENU *********************" );
			System.out.println ( "Enter 0 to Exit" );
			System.out.println ( "Enter 1 to Create Profile" );
			System.out.println ( "Enter 2 to View Profile" );
			System.out.println ( "Enter 3 to View All Profile" );
			System.out.println ( "Enter 4 to Delete Profile" );
			System.out.println ( "Enter your choice: " );
			
				// take choice from user
			
			try {
			
				choice = Integer.parseInt ( br.readLine () );
			
			}catch ( IOException e ) {
				
				e.printStackTrace ();
			}
			
			
			switch ( choice ) {
			
				case 0: break;
				
				case 1:	bi.createProfile ();	
						break;
						
				case 2: bi.viewProfile ();
						break;
						
				case 3: bi.viewAllProfile ();
						break;						
						
				case 4: bi.deleteProfile ();
						break;
				
				default: System.out.println ( "Wrong choice Enter Again....." );
						 break;
			
			}			
			
		} while ( choice != 0 ); // end of menu		

	} // end of the MAIN class

} // end of ViewLayer class
