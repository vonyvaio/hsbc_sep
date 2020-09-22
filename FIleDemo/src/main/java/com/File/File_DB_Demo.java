package com.File;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class File_DB_Demo {
	
	public static void main ( String args [] ) {
		
		try {
			
			// load driver
			
			Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
			
			// get connection to database
			
			Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
			
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "SELECT * FROM InstagramUser" );
			
			// execute query
			
			ResultSet rs = ps.executeQuery ();
			
			ResultSetMetaData meta = rs.getMetaData ();
			
			for ( int i = 1 ; i < meta.getColumnCount () ; i++ ) {
				
				System.out.println ( "Name is: " + meta.getColumnName ( i ) );
				System.out.println ( "Type is: " + meta.getColumnTypeName ( i ) );
				System.out.println ( "Size is: " + meta.getColumnDisplaySize ( i ) + "\n");
			}
				
			
		
		}
		
		catch ( ClassNotFoundException | SQLException sql ) {
			
			sql.printStackTrace ();
		}
		
	}

}
