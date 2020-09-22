package com.File;

import java.io.File;

public class File_Demo {

	public static void main(String[] args) {
		
		File f = new File ( "d:/HSBC_DEMO" );
		
		if ( f.mkdir () ) {
			
			System.out.println ( "Directory created successfully" );
		
		}else {
			
			System.out.println ( "Directory could not be created" );
		}
		

	}

}
