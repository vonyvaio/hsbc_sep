package com.Assignment;

// 25.	Create a class to calculate Square root?

import java.util.Scanner;

public class question25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		double number; // variable to hold number
		
		System.out.println ( "Enter Number to calculate square root: " );
		number = sc.nextDouble (); // accept number		
		
		// print square root
		
		System.out.println ( "The Square root of number is " + Math.sqrt ( number ) );
		
		sc.close (); // close scanner

	} // end of main class

} // end of question25 class