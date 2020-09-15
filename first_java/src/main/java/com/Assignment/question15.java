package com.Assignment;

// 15.	Write a program to swap two numbers without using any temporary variable?

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int a, b; // for holding two numbers
		
		System.out.println ( "Enter First Number: " );
		a = sc.nextInt (); // enter 1st number
		
		System.out.println ( "Enter Second Number: " );
		b = sc.nextInt (); // enter 2nd number

		// swap without using temporary variables
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println ( "The numbers after swapping a = " + a + ", b = " + b ); // print after swapping numbers
		
		sc.close (); // close scanner
		
	} // end of main class

} // end of question15 class