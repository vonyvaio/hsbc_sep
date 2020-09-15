package com.Assignment;

// 7.	Write a program to calculate average of the n number using an array concept

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int size = 1; // initial size of array
		
		int sum = 0; // to store sum of numbers
		
		System.out.println ( "Enter how may numbers to calculate average: " );
		size = sc.nextInt ();
		
		int numbers [] = new int [ size ]; // dynamically initialize array
		
		// input numbers
		
		for ( int i = 0 ; i < size ; i++ ) {
			
			System.out.println ( "Enter Number " + ( i + 1 ) + ": " );
			numbers [ i ] = sc.nextInt ();
			
			sum += numbers [i];
		}
		
		// calculating average
		
		System.out.println ( "The average of Numbers is = " + ( sum/ size ) );
		
		sc.close (); // close scanner
		
	} // end of main class

} // end of question7 class
