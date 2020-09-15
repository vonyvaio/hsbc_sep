package com.Assignment;

// 23.	Create a class to calculate Simple interest?

import java.util.Scanner;

public class question23 {

	public static void main(String[] args) {

		double principle, rate, time; // variables to hold data
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		System.out.println ( "Enter Principle Amount = " );
		principle = sc.nextDouble (); // accept principle
		
		System.out.println ( "Enter time in years = " );
		time = sc.nextDouble (); // accept time in years
		
		System.out.println ( "Enter rate% = " );
		rate = sc.nextDouble (); // accept rate in percentage
		
		// print simple interest
		
		System.out.println ( "The Simple Interest is = " + ( ( principle * time * rate )/ 100 ) );		

		sc.close (); // close scanner
		
	} // end of main class

} // end of question23 class