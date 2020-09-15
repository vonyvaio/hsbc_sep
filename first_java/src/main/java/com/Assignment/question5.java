package com.Assignment;

// 5.	Write a program to write table of your desired number?

import java.util.Scanner;

public class question5 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input

		int table; // to create table of number
		int cap; // to create table upto cap number
		
		System.out.println ( "Enter Number to create table of: ");
		table = sc.nextInt ();
		
		System.out.println ( "Enter CAP value of table: ");
		cap = sc.nextInt ();
		
		for ( int i = 1 ; i <= cap ; i++ ) {
			
			System.out.println ( table + " x " + i + " = " + ( i * table )  );
		}
		
		
		sc.close (); // closing scanner
	} // end of main class

} // end of question5 class
