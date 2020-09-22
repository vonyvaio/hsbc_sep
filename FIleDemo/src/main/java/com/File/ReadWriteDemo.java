package com.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;


public class ReadWriteDemo {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		
		File f = new File ( "d:/HSBC_DEMO/one.txt" );
		
		FileOutputStream out = new FileOutputStream ( f, true );
		
		
		System.out.println ( "Enter Your Data: " );
		String read = br.readLine ();
		
		for ( int i = 0 ; i < read.length () ; i++ ) {
			
			out.write ( read.charAt ( i ) );
			
		}
		
		out.write ( '\n' );
		out.close ();
		
		System.out.println ( "Writing Complete" );

	}

}
