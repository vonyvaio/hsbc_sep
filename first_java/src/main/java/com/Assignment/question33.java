package com.Assignment;

// 33.	Write a program to calculate average of the n number using a separate function other than main.

import java.util.Scanner;

class average {
	
	// constructor
	
	average () {
		
		// empty
	}
	
	
	// function to calculate average
	
	double calculate_average ( int size, int a [] ) {
		
		double sum = 0.0;
		
		for ( int  i = 0 ; i < size ; i++ ) {
			
			sum += a [i];
		}
		
		return ( sum/ size );
	}
	
} // end of class average

public class question33 {

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
		}
		
		average a = new average (); // initializing instance of class average
		
		// calculating average
				
		System.out.println ( "The average of Numbers is = " + a.calculate_average ( size, numbers ) );
				
		sc.close (); // close scanner
		

	} // end of main class

} // end of question33 class