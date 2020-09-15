package com.Assignment;

// 17.	Write a program to find the sum of numbers up to n numbers. The number must be passed as command line arguments and validated for an int data type.
// The above two exercises are to be tried with different types of loops to practice the language constructs.

public class question17 {

	public static void main(String[] args) {

		// validating input for int data type
		
		try {
					
			int n = Integer.parseInt ( args [0] ); // parse command line arguments

			// print sum
					
			System.out.println ( "The sum of first " + n + " Numbers is = " + ( n * ( n + 1 ) / 2 ) );
			
					
		}catch ( NumberFormatException e ) {
				
			System.out.println ( "Number is Not Integer... EXITING" );
			e.printStackTrace(); // printing error log
		}

	} // end of main class

} // end of question17 class