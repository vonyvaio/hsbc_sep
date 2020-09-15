package com.Assignment;


// 2.	Write a program to print your name 10 times horizontally and vertically by while loop?

public class question2 {

	public static void main(String[] args) {
	
		String name = "ASHUTOSH"; // declaring my name
		
		
		// printing my name 10 time horizontally
		
		System.out.println ();	// new line
		
		for ( int  i = 0 ; i < 10 ; i++ ) {
			
			System.out.println ( name + "\n" );			
		}
		
		System.out.println ();	// new line
		
		
		// printing my name vertically 10 times
		
		for ( int i = 0 ;  i < name.length() ; i++ ) {
			
			for ( int j = 0 ; j < 10 ; j++ ) {
				
				System.out.print ( name.charAt ( i ) + " " );
			}
			
			System.out.println ( "\n" );	// new line
		}
		

	} // end of main function

} // end of question2 class
