package com.Assignment;

// 14.	Write a program to calculate sum of the odd integers between 1 and 99?

public class question14 {

	public static void main(String[] args) {

		int sum = 0; // to hold sum
		
		// calculate sum of odd numbers between 1 and 99

		for ( int i = 2 ; i < 99 ; i += 2 ) {
			
			sum += i;
		}
		
		System.out.println ( "The sum of odd numbers between 1 and 99 is " + sum ); // print sum
		
	} // end of main class

} // end of question14 class
