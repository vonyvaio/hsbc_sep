package com.Assignment;

// 30.	Write a program to add two matrixes.

import java.util.Scanner;

public class question30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ); // for accepting input
		
		int matrix1 [][] = new int [3][3];	// variable to hold matrix data
		int matrix2 [][] = new int [3][3];	// variable to hold matrix data
		
		// input matrix1 data
		
		System.out.println ( "MATRIX A = " );
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			
			for ( int j = 0 ; j < 3 ; j++ )  {
				
				System.out.println ( "Enter cell A [" + ( i+1 ) + "]" + "[" + (j+1) + "] = " );
				matrix1 [i][j] = sc.nextInt ();
			}	
		}

		// input matrix2 data
		
		System.out.println ( "\n\nMATRIX B = " );
		
		for ( int i = 0 ; i < 3 ; i++ ) {
					
			for ( int j = 0 ; j < 3 ; j++ )  {
						
				System.out.println ( "Enter cell B [" + ( i+1 ) + "]" + "[" + (j+1) + "] = " );
				matrix2 [i][j] = sc.nextInt ();
			}	
		}
		
		// print matrix addition
		
		System.out.println ( "\n\nMATRIX A + MATRIX B = \n" );
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			
			for ( int j = 0 ; j < 3 ; j++ ) {
				
				System.out.print ( ( matrix1 [i][j] + matrix2 [i][j] ) + " " );
			}
			
			System.out.print ("\n");
		}

		sc.close (); // close scanner

	} // end of main class

} // end of question30 class