package com.Assignment;

// 3.	Write a program to decide grade?

import java.util.Scanner;


public class question3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner ( System.in );	// for accepting input
		
		int grade;	// variable to hold grade
		
		System.out.println ( "Enter grade out of 100: " );
		grade = sc.nextInt (); // accept input

		
		// assign grade
		
		if ( grade <= 30 ) {
			
			System.out.println ( "The Grade is E" );
		}
		
		else if ( ( grade > 30 ) && ( grade <= 50 ) ) {
			
			System.out.println ( "The Grade is D" );
		}
		
		else if ( ( grade > 50 ) && ( grade <= 75 ) ) {
			
			System.out.println ( "The Grade is C" );
		}
		
		else if ( ( grade > 75 ) && ( grade <= 90 ) ) {
			
			System.out.println ( "The Grade is B" );
		}
		
		else {
			
			System.out.println ( "The Grade is A" );
		}
		
		
		sc.close (); // close scanner	
		
	} // end of main class

} // end of question3 class
