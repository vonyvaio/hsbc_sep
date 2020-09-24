package com.ViewLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.BusinessLayer.*;


public class ViewLayer {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );	// for reading input
		
		int choice = 0;
		
		BusinessLayerInterface bi = new BusinessLayer ();
		
			// provide choice to user
		
		do {
			
			System.out.println ( "\n********************* MENU *********************" );
			System.out.println ( "Enter 0 to Exit" );
			System.out.println ( "Enter 1 to Add Items" );
			System.out.println ( "Enter 2 to Retrieve Items" );
			System.out.println ( "Enter 3 to Get report ( Sort by Sold )" );
			System.out.println ( "Enter your choice: " );
			
				// take choice from user
			
			try {
			
				choice = Integer.parseInt ( br.readLine () );
			
			}catch ( IOException e ) {
				
				e.printStackTrace ();
			}
			
			
			switch ( choice ) {
			
				case 0: break;
				
				case 1:	bi.addItems ();	
						break;
						
				case 2: bi.viewItems ();
						break;
						
				case 3: bi.viewReport ();
						break;						
				
				default: System.out.println ( "Wrong choice Enter Again....." );
						 break;
			
			}			
			
		} while ( choice != 0 ); // end of menu		

	} // end of the MAIN class

} // end of ViewLayer class