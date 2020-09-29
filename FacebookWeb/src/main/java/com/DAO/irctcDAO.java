package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class irctcDAO implements irctcDAOInterface {

	private Connection con;
	
	public irctcDAO () {
		
		try {
			
			// load driver
			
			Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
			
			// get connection to database
			
			con = DriverManager.getConnection ( "jdbc:derby:d:/database/irctc", "ashutosh", "4159" );
			
		} catch ( SQLException | ClassNotFoundException e ) {
			
			e.printStackTrace ();
		}
	}
	
	@Override
	public List <String> returnTrainStation ( String country, String keyword ) {
		
		List < String > station_list = new ArrayList < String > ();
		
		try {
			
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "SELECT CITY FROM irctc where COUNTRY = ?" );
			
			ps.setString ( 1, country );
			
			ResultSet rs = ps.executeQuery ();
			
			while ( rs.next () ) {
				
				if ( rs.getString ( 1 ).toLowerCase().contains ( keyword.toLowerCase () ) ) {
					
					station_list.add ( rs.getString ( 1 ) );
				}
			}
			
		} catch ( SQLException sql ) {
			
			sql.printStackTrace ();
		}
		
		return station_list;
	}

	
	@Override
	public List < String > returnCountry () {
		
		List < String > country_list = new ArrayList < String > ();
		
		try {
		
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "select distinct COUNTRY from irctc" );
		
			ResultSet rs = ps.executeQuery ();
			
			while ( rs.next () ) {
				
				country_list.add ( rs.getString ( 1 ) );
			}
			
		} catch ( SQLException e ) {
			
			e.printStackTrace ();
		}
		
		return country_list;
	
	} // end of returnCountry Function
	
	
}
