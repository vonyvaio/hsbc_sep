package com.Assignment;

// 26.	Create a class to calculate Square?

import java.util.Scanner;

public class question26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in ); // for accepting input
				
		double number; // variable to hold number
		
		System.out.println ( "Enter Number to calculate square: " );
		number = sc.nextDouble (); // accept number	
		
		// print square
		
		System.out.println ( "The Square of number is " + ( number * number ) );
			
		sc.close (); // close scanner		
		
	} // end of main class

} // end of question26 class