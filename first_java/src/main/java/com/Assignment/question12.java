package com.Assignment;

// 12.	Find the cube of a numbers between 1 to 10?

public class question12 {

	public static void main(String[] args) {
		
		int number = 1;
		
			// generate cubes
		
		for ( int i = 1 ; i <= 10 ; i++ ) {
		
			System.out.println ( number + "^3 = " + ( number * number * number ) );
			
			number++;
		}

	} // end of main class

} // end of question12 class
