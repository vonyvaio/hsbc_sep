package com.Assignment;

// 8.	Write a program to reverse an integer?

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int number;	// to hold number to be reversed
		int reverse = 0;	// reversed number
		
		System.out.println ( "Enter Number to be reversed: " );
		number = sc.nextInt ();
		
		int rem = number % 10;
		int q = number / 10;
		
		// reversing the number
		
		while ( q != 0 ) {
			
			reverse = reverse * 10 + rem;
			
			rem = q % 10;
			q = q / 10;
		}
		
		reverse = reverse * 10 + rem;
		
		System.out.println ( "The reverse of number " + number + " is " + reverse );	// print reversed number
		
		sc.close (); // close scanner

	} // end of main class

} // end of question8 class
