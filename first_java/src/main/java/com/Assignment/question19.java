package com.Assignment;

// 19.	Write a program to find the sum of the series. 1+(x^1)/1!+(x^2)/2!+(x^3)/3!+...+(x^n)n!

import java.util.Scanner;

class series {
	
	int n; // to hold no of terms
	int x; // to hold value of variable x
	
	
	// constructor
	
	series () {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		System.out.println ( "Enter No of terms: " );
		n = sc.nextInt (); // enter 1st number
		
		System.out.println ( "Enter value of x: " );
		x = sc.nextInt (); // enter 1st number
		
		sc.close (); // close scanner
		
	} // end of constructor
	
	
	// function to calculate factorial
	
	int factorial ( int a ) {
		
		if ( a < 0 || a == 0 || a == 1 ) {
			
			return 1;
		}
		
		return a * factorial ( a - 1 );
		
	} // end of factorial function
	
	
	// function to calculate sum
	
	double sum_of_series () {
		
		if ( n == 1 ) return 1; // return if only 1 term

		double sum = 1;
		
		for ( int i = 1 ; i < n ; i++ ) {
			
			sum += Math.pow ( x, i ) / factorial ( i );
 		}
		
		return sum;
	}
	
} // end of class series


	// DRIVER CODE

public class question19 {

	public static void main(String[] args) {
		
		series s = new series ();

		System.out.println ( "The sum of series is " + s.sum_of_series () );
		
	} // end of main class

} // end of question19 class