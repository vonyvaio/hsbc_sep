package com.File;

import java.io.File;
import java.io.IOException;

public class FILE_DEMO2 {

	public static void main(String[] args) throws IOException {

		File f = new File ( "d:/HSBC_DEMO/one.txt" );
		
		if ( f.createNewFile () ) {
			
			System.out.println ( "File created successfully" );
		
		}else {
			
			System.out.println ( "File could not be created" );
		}

	}

}
