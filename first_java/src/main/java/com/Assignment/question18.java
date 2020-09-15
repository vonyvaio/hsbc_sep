package com.Assignment;

// 18.	Write a program to print Armstrong numbers
// ( Hint: Armstrong numbers will have the following characteristics. xyz=x^3+y^3+z^3.

import java.util.Scanner;


class Armstrong {
	
	int start_number;
	int end_number;	// range to generate Armstrong number
	
	// constructor
	
	Armstrong () {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		System.out.println ( "Enter First Number: " );
		start_number = sc.nextInt (); // enter 1st number
		
		System.out.println ( "Enter end Number: " );
		end_number = sc.nextInt (); // enter 2nd number
		
		sc.close (); // close scanner
		
	} // end of constructor
	
	
	// function to generate armstrong number
	
	void generate_Armstrong () {
		
		System.out.println ( "Armstrong numbers between " + start_number + " and " + end_number + " are: " );
		
		for ( int i = start_number ; i <= end_number ; i++  ) {
			
			int sum = 0;
			
			int rem = i % 10;
			int q = i / 10;
			
			// Checking for Armstrong by extracting digit
			
			while ( q != 0 ) {
				
				sum += rem * rem * rem;
				
				rem = q % 10;
				q = q / 10;
			}
			
			sum += rem * rem * rem;
			
			if ( sum == i ) {
				
				System.out.println ( sum );
			}
		}
		
	} // end of generate_Armstrong () function
	
} // end of Armstrong class


	// DRIVER CLASS

public class question18 {

	public static void main(String[] args) {

		Armstrong a = new Armstrong ();
		
		a.generate_Armstrong(); // generate Armstrong numbers

	} // end of main class

} // end of question18 class