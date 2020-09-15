package com.Assignment;

/*
 * 
	28. Write a program to print following
                     1
                   2 1 2
               	 3 2 1 2 3	
               4 3 2 1 2 3 4
 * 
 */

import java.util.Scanner;

public class question28 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int lines; // to hold number of lines
		
		System.out.println ( "Enter Number of lines: " );
		lines = sc.nextInt (); // accept number
		
		// print pattern

		System.out.println ( "\nPATTERN: \n" );
		
		for ( int i = 1 ; i <= lines ; i++ ) {
			
			int spaces = lines - i; // spaces to leave
			
			while ( spaces-- != 0 ) System.out.print ( " " );	// leave spaces
			
			// print number till 1 comes
			
			int number = i;
			
			while ( number != 1 ) {
				
				System.out.print ( number-- + " " );
			}
			
			System.out.print ( number + " " );
			
			// print till line number comes
			
			while ( number != i ) {
				
				System.out.print ( ++number + " " );
			}
			
			System.out.println ( "\n" ); // new line
		}
		
		sc.close (); // close scanner

	} // end of main class

} // end of question28 class