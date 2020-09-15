package com.Assignment;

// 10.	Write a program to convert 69F into the equivalent centigrade temp?


import java.util.Scanner;


public class question10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		double temprature; // to hold temperature
		
		System.out.println ( "Enter temprature in Farenhite: " );
		temprature = sc.nextDouble ();
		
		System.out.println ( temprature + "F = " +  ( (temprature - 32 ) * 5 / 9 ) + "C" );
		
		sc.close (); // close scanner

	} // end of main class

} // end of question10 class
