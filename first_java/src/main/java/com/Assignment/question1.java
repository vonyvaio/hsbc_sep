package com.Assignment;

//	1.	Write a program to add two numbers by command line argument?

public class question1 {

	public static void main(String[] args) {
		
		// checking if at least two numbers are extracted by command line
		
		if ( args.length < 2 ) {
			
			System.out.println ( "\n Please Enter 2 Numbers" );
		}
		
		else {
			
			// error checking
			
			try {
			
				// declaring two double variables
			
				double d1 = Double.parseDouble ( args [0] );	// first number
			
				double d2 = Double.parseDouble ( args [1] );	// second number
	
				System.out.println ( "\nAddition Of The Two Numbers is = " + (d1 + d2) );	// printing answer
			
			}catch (Exception e) {
				
				System.out.println ( "Incorrect Input" );
				e.printStackTrace();
			}

		}

	} // end of main
	
} // end of question 1 