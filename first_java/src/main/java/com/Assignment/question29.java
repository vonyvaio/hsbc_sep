package com.Assignment;

/*
 * 
 * 29.	dd. Write a program to print following
              1
           	2 1 2
          3 2 1 2 3	
     	4 3 2 1 2 3 4
          3 2 1 2 3
            2 1 2
              1

 * 
 */

import java.util.Scanner;

public class question29 {

	public static void main(String[] args) {


		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int lines; // to hold number of lines
		
		System.out.println ( "Enter Number of lines: " );
		lines = sc.nextInt (); // accept number
		
		// print pattern

		System.out.println ( "\nPATTERN: \n" );
		
		// PRINT UPPER PART		
		
		for ( int i = 1 ; i <= lines ; i++ ) {
			
			int spaces = lines - i; // spaces to leave
			
			while ( spaces-- != 0 ) System.out.print ( " " );	// leave spaces
			
			// print number till 1 comes
			
			int number = i;
			
			while ( number != 1 ) {
				
				System.out.print ( number-- + " " );
			}
			
			System.out.print ( number + " " ); // print 1
			
			// print till line number comes
			
			while ( number != i ) {
				
				System.out.print ( ++number + " " );
			}
			
			System.out.println ( "\n" ); // new line
		}
		
		for ( int i = 1 ; i < lines ; i++ ) {
			
			// leave spaces
			
			int spaces = i;
			while ( spaces-- != 0 ) System.out.print ( " " );
			
			int number = lines - i;
			
			// print till 1
			
			while ( number != 1 ) {
				
				System.out.print ( number-- + " " );
			}
			
			System.out.print ( number + " " ); // print 1
			
			while ( number != ( lines - i ) ) {
				
				System.out.print ( ++number + " " );
			}
				
			System.out.println ( "\n" ); // new line
		}
		
		// PRINT LOWER PART
		
		sc.close (); // close scanner

	} // end of main class

} // end of question29 class