package com.Assignment;

// 22.	Write a program to multiply two given 3 × 3 matrices and output the result.

import java.util.Scanner;

public class question22 {

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
		
		
		// matrix multiplication
		
		int mul [][] = new int [3][3]; // to hold multiplication
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			
			for ( int j = 0 ; j < 3 ; j++ ) {
				
				mul [i][j] = 0;
				
				for ( int k = 0 ; k < 3 ; k++ ) {
					
					mul [i][j] += matrix1 [i][k] * matrix2 [k][j];
				}
			}
		}
		
		// print matrix multiplication
		
		System.out.println ( "\n\nMATRIX A x MATRIX B = \n" );
		
		for ( int i = 0 ; i < 3 ; i++ ) {
			
			for ( int j = 0 ; j < 3 ; j++ ) {
				
				System.out.print ( mul [i][j] + " " );
				
			}
			
				System.out.println ();
		}
		
		sc.close (); // close scanner

	} // end of main class

} // end of question22 class