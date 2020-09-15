package com.Assignment;

// 4.	Write a program for Fibonacci series from 1 to 20?

public class question4 {

	public static void main(String[] args) {
		
		int a = 0;	// first number
		int b = 1;	// second number
		
		int c; // to hold third number
		
		// generate first 20 number of series
		
		System.out.println ( a + " " + b );	// print first two numbers
		
		for ( int i = 1 ; i <= 20 ; i++ ) {
			
			c = a + b;
			
			System.out.print ( " " + ( c ) );	// generate third number
			
			a = b;
			b = c;
			
		} // end of for loop 

	} // end of main class

} // end of question 4
