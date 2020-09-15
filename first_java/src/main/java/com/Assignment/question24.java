package com.Assignment;

// 24.	Create a class to calculate Compound Interest?

import java.util.Scanner;

public class question24 {

	public static void main(String[] args) {
		
		double principle, rate, time; // variables to hold data
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		System.out.println ( "Enter Principle Amount = " );
		principle = sc.nextDouble (); // accept principle
		
		System.out.println ( "Enter time in years = " );
		time = sc.nextDouble (); // accept time in years
		
		System.out.println ( "Enter rate% = " );
		rate = sc.nextDouble (); // accept rate in percentage
		
		// print compound interest
		
		System.out.println ( "The Compund Interest is = " + ( ( principle * Math.pow ( 1 + rate / 100, time ) ) - principle ) );

		sc.close (); // close scanner
		
	} // end of main class

} // end of question24 class