package com.Assignment;

import java.util.Scanner;

// 32.	Write a program to copy data of one array into another array.

public class question32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int size = 1; // initial size of array
		
		System.out.println ( "Enter how may numbers? " );
		size = sc.nextInt ();

		int numbers [] = new int [ size ]; // dynamically initialize array
		
		// input numbers
		
		for ( int i = 0 ; i < size ; i++ ) {
			
			System.out.println ( "Enter Number " + ( i + 1 ) + ": " );
			numbers [ i ] = sc.nextInt ();

		}
		
		// create new array
		
		int new_array [] = new int [size];
		
		// copy old array to new
		
		for ( int i = 0 ; i < size ; i++ ) {
			
			new_array [i] = numbers [i];
		}
		
		// print new array		
		
		System.out.println ( "\n\nCopied Array = " );
		
		for ( int i = 0 ; i < size ; i++ ) {
			
			System.out.print ( new_array [i] + " " );
		}
		
		sc.close (); // close scanner
		
	} // end of main class

} // end of question32 class