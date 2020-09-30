package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class countryStateCityInterface implements countryStateCityInterfaceLayer {
	
	private Connection con;
	
	public countryStateCityInterface () {
		
		try {
			
			// load driver
			
			Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
			
			// get connection to database
			
			con = DriverManager.getConnection ( "jdbc:derby:d:/database/irctc", "ashutosh", "4159" );
			
		} catch ( SQLException | ClassNotFoundException e ) {
			
			e.printStackTrace ();
		}
		
	} // end of constructor
	
	
	@Override
	public List < String > getCity ( String keyword, String state ) {
		
		List < String > city_list = new ArrayList < String > ();
		
		try {
			
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "select CITY from city where STATE = ?" );
		
			ps.setString ( 1, state );
			
			ResultSet rs = ps.executeQuery ();
			
			while ( rs.next () ) {
				
				if ( rs.getString ( 1 ).toLowerCase().contains ( keyword.toLowerCase () ) ) {
					
					city_list.add ( rs.getString ( 1 ) );
				}					
			}
			
		} catch ( SQLException e ) {
			
			e.printStackTrace ();
		}
		
		return city_list;
	}

		
	@Override
	public List < String > getState ( String keyword, String country ) {
		
		List < String > state_list = new ArrayList < String > ();
		
		try {
			
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "select STATE from state where COUNTRY = ?" );
		
			ps.setString ( 1, country);
			
			ResultSet rs = ps.executeQuery ();
			
			while ( rs.next () ) {
				
				if ( rs.getString ( 1 ).toLowerCase().contains ( keyword.toLowerCase () ) ) {
					
					state_list.add ( rs.getString ( 1 ) );
				}					
			}
			
		} catch ( SQLException e ) {
			
			e.printStackTrace ();
		}
		
		return state_list;
		
	} // end of getState function
	
	@Override
  	public List < String > getCountry ( String keyword ) {
		
		List < String > country_list = new ArrayList < String > ();
		
		try {
			
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "select distinct COUNTRY from country" );
		
			ResultSet rs = ps.executeQuery ();
			
			while ( rs.next () ) {
				
				if ( rs.getString ( 1 ).toLowerCase().contains ( keyword.toLowerCase () ) ) {
					
					country_list.add ( rs.getString ( 1 ) );
				}					
			}
			
		} catch ( SQLException e ) {
			
			e.printStackTrace ();
		}
		
		return country_list;
	}
	

} // end of countryStateCityInterface class

