package com.Assignment;

// 21.	Write a program to find the determinant of a 3 × 3 matrix.

import java.util.Scanner;

public class question21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int matrix [][] = new int [3][3];	// variable to hold matrix data
		
		// input matrix data
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			
			for ( int j = 0 ; j < 3 ; j++ )  {
				
				System.out.println ( "Enter cell A [" + ( i+1 ) + "]" + "[" + (j+1) + "] = " );
				matrix [i][j] = sc.nextInt ();
			}	
		}


		// calculate determinant
		
		int t1, t2, t3; // to hold intermediate terms

		t1 = matrix [0][0] * ( matrix [1][1] * matrix [2][2] - matrix [1][2] * matrix [2][1] );
		t2 = matrix [0][1] * ( matrix [1][0] * matrix [2][2] - matrix [1][2] * matrix [2][0] );
		t3 = matrix [0][2] * ( matrix [1][0] * matrix [2][1] - matrix [1][1] * matrix [2][0] );
		
		System.out.println ( "The Determinant of matrix is = " + (t1 - t2 + t3) );

		sc.close (); // close scanner

	} // end of main class

} // end of question21 class