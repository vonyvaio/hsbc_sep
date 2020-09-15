package com.Assignment;

// 13.	Find the area of circle?

import java.util.Scanner;

public class question13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		double radius; // to hold radius
		
		System.out.println ( "Enter radius of circle: " );
		radius = sc.nextDouble ();
		
		System.out.println ( "The area of circle is " + ( 22/ 7 * radius * radius ) );
		
		sc.close (); // close scanner
		
	} // end of main class

} // end of question13 class
