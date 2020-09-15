package com.Assignment;

import java.util.Scanner;

/*

 	27.	Write a program to print following
1
1 2
1 2 3	
1 2 3 4

*/

public class question27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int lines; // to hold number of lines
		
		System.out.println ( "Enter Number of lines: " );
		lines = sc.nextInt (); // accept number
		
		// print pattern

		System.out.println ( "\nPATTERN: \n" );
		
		for ( int i = 1 ; i <= lines ; i++ ) {
			
			for ( int k = 1 ; k <= i ; k++ ) {
				
				System.out.print ( k + " " );
			}
			
			System.out.print ( "\n" );
			
		}
		
		sc.close (); // close scanner

	} // end of main class

} // end of question27 class