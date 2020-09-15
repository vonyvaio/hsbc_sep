package com.Assignment;

// 16.	Write a program to print the multiplication table of a given number.
// The number must be passed as command line arguments and validated for an int data type.

public class question16 {

	public static void main(String[] args) {		
		
		// validating input for int data type
		
		try {
			
			int table = Integer.parseInt ( args [0] ); // parse command line arguments

			// print table
			
			for ( int i = 1 ; i <= 10 ; i++ ) {
				
				System.out.println ( table + " x " + i + " = " + ( table * i  ) );
			}
			
		}catch ( NumberFormatException e ) {
			
			System.out.println ( "Number is Not Integer... EXITING" );
			e.printStackTrace(); // printing error log
		}

	} // end of main class

} // end of question16 class