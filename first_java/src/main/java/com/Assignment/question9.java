package com.Assignment;

/*

9.	print

0
0 2
0 3   6
0 4   8   12
0 5 10 15 20
0 6 12 18 24 30  
0 7 14 21 28 35 42

*/

public class question9 {

	public static void main(String[] args) {

		int j = 1; // for horizontal increment

		System.out.print ( "0" ); // print 0
		
		// print pattern
		
		for ( int i = 2 ; i <= 7 ; i++ ) {
			
			System.out.print ( "\n0" ); // print 0
			int k = 1;
			
			while ( k <= j ) {
				
				System.out.print( " " + ( k * i ) );
				
				k++; // increment k
			}
			
			j++;
		}

	} // end of main class

} // end of question9 class
