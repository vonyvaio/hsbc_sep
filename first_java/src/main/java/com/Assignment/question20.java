package com.Assignment;

// 20.	Write a program to arrange the given numbers in ascending/descending order.

import java.util.Scanner;


public class question20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int size = 1; // initial size of array
		
		System.out.println ( "Enter how may numbers?: " );
		size = sc.nextInt ();
		
		int numbers [] = new int [ size ]; // dynamically initialize array
		
		// input numbers
		
		for ( int i = 0 ; i < size ; i++ ) {
			
			System.out.println ( "Enter Number " + ( i + 1 ) + ": " );
			numbers [ i ] = sc.nextInt ();
		}
		
		
		// sort numbers using bubble sort
		
		for ( int i = 0 ; i < size - 1  ; i++ ) {
			
			int flag = 0;
			
			for ( int j = 0 ; j < size-i-1 ; j++ ) {
				
				if ( numbers [j] > numbers [j+1] ) {
					
					int temp = numbers [j];
					numbers [j] = numbers [j+1];
					numbers [j+1] = temp; 
					
					flag = 1;
				}
			}
			
			if ( flag == 0 ) break; // break if no swap
		}
		
		// print sorted numbers
		
		System.out.println ( "The sorted array is: " );
		
		for ( int i = 0 ; i < size ; i++ ) {
			
			System.out.print ( numbers [i] + " " );
		}
		
		
		sc.close (); // close scanner

	} // end of main class

} // end of question20 class