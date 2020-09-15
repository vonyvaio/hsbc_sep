package com.Assignment;

// 11.	Write a program to calculate factorial of a number?

import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int number;
		
		System.out.println ( "Enter Number to generate factorail: " );
		number = sc.nextInt ();	// enter number
		
			// pre test conditions
		
		if ( number < 0 ) {
			
			System.out.println ( "Factorail of negative number does not exists" );
		}
		
		else if ( number == 0 ) {
			
			System.out.println ( "Factorail is 1" );
		}
		
		else {
			
			int fact = 1;
			
			while ( number != 1 ) {
				
				fact = fact * number;
				number--;
			}
			
			System.out.println ( "Factorail is " + fact );
		}
		
		sc.close (); // close scanner
		
	} // end of main class

} // end of quetion11 class
