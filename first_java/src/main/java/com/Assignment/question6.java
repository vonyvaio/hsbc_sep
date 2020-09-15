package com.Assignment;

// 6.	Write a program to find weather a number is Prime or not

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int prime;	// to hold prime number
		int flag = 0; // to raise alert
		
		System.out.println ( "Enter Number to be checked for prime test: " );
		prime = sc.nextInt ();
		
		// prime test condition
		
		for ( int i = 2 ; i <= Math.sqrt ( prime ) ; i++ ) {
			
			if ( ( prime % i ) == 0 ) {
				
				flag = 1;
				break;
			}
		}
		
		if ( flag == 1 ) {
			
			System.out.println ( "The number is not prime" );
		}
		else {
			
			System.out.println ( "The number is prime" );
		}

		sc.close (); // close scanner
		
	} // end of main class

} // end of question6 class
