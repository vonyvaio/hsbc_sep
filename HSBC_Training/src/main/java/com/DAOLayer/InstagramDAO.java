package com.DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.entity.*;
import com.utility.InstagramException;

public class InstagramDAO implements Instagram_DAO_Interface {

	@Override
	public int createProfileDAO ( InstagramUser iu ) {

		try {
		
			// load driver
			
			Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
			
			// get connection to database
			
			Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
			
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "INSERT INTO InstagramUser VALUES (?,?,?,?)" );
			
			ps.setString ( 1, iu.getName() );
			ps.setString ( 2, iu.getPassword() );
			
			ps.setString ( 3, iu.getEmail() );
			ps.setString ( 4, iu.getAddress() );
			
			// execute query
			
			if ( ps.executeUpdate () > 0 ) {
				
				return 1;
			}
		
		}
		
		catch ( ClassNotFoundException | SQLException sql ) {
			
			sql.printStackTrace ();
		}
		
		return 0;		
		
	}
	
	@Override
	public int deleteProfileDAO ( InstagramUser iu ) throws Exception{
		
		// deleting profile from database
		
		// load driver
		
		Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
						
		// get connection to database
					
		Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
						
		// prepare query
						
		PreparedStatement ps = con.prepareStatement ( "SELECT * FROM InstagramUser WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );
				
		// execute Query
				
		ResultSet rs = ps.executeQuery ();
		
		if ( rs != null ) {
			
			ps = con.prepareStatement ( "DELETE FROM InstagramUser WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );	// delete record
			
			if ( ps.executeUpdate () > 0 ) {
				
				return 1;
			}			
		}
		
		return 0;
	}

	@Override
	public List <InstagramUser> viewAllProfileDAO () throws Exception {

		// database logic to view all profile
		
		// load driver
		
		Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
								
		// get connection to database
								
		Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
								
		// prepare query
								
		PreparedStatement ps = con.prepareStatement ( "SELECT * FROM InstagramUser" );
						
		// execute Query
						
		ResultSet rs = ps.executeQuery ();
						
		List < InstagramUser > iul = new ArrayList < InstagramUser > ();
		
		while ( rs.next() ) {
		
			InstagramUser iu = new InstagramUser ();
		
			iu.setName ( rs.getString ( 1 ) );
			iu.setEmail ( rs.getString ( 3 ) );
			iu.setAddress ( rs.getString ( 4 ) );
						
			iul.add ( iu );
		}
					
		return iul;
	}
	
	@Override
	public List <InstagramUser> searchProfileDAO ( InstagramUser iu ) throws Exception {
				
		// logic to search profile
		
		// load driver
		
		Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
						
		// get connection to database
						
		Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
						
		// prepare query
						
		PreparedStatement ps = con.prepareStatement ( "SELECT * FROM InstagramUser WHERE NAME = '" + iu.getName() + "'" );
				
		// execute Query
				
		ResultSet rs = ps.executeQuery ();
				
		if ( rs != null ) {
		
			List < InstagramUser > iul = new ArrayList < InstagramUser > ();
			
			while ( rs.next() ) {
				
				InstagramUser iu1 = new InstagramUser ();
				
				iu1.setName ( rs.getString ( 1 ) );
				iu1.setEmail ( rs.getString( 3 ) );
				iu1.setAddress ( rs.getString( 4 ) );
				iu1.setPassword ( null );
				
				iul.add ( iu1 );
			}
			
			return iul;
		
		}
		
		return null;
	}
	
	@Override
	public InstagramUser viewProfileDAO ( InstagramUser iu ) throws Exception {
				
		// logic to view profile
		
		// load driver
		
		Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
				
		// get connection to database
				
		Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
				
		// prepare query
				
		PreparedStatement ps = con.prepareStatement ( "SELECT * FROM InstagramUser WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );
		
		// execute Query
		
		ResultSet rs = ps.executeQuery ();
		
		if ( rs.next() ) {
			
			iu.setEmail ( rs.getString( 3 ) );
			iu.setAddress ( rs.getString( 4 ) );
			
			return iu;
		}
		
		return null;
	}

	@Override
	public InstagramUser editProfileDAO ( InstagramUser niu, InstagramUser iu, int i ) throws Exception {
		
		// logic to edit profile
		
		// load driver
						
		Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
								
		// get connection to database
								
		Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
								
		// prepare query
		
		PreparedStatement ps;
		
		// based on integer received update query
								
		if ( i == 1 ) { // for name
		
			ps = con.prepareStatement ( "UPDATE InstagramUser SET NAME = '" + niu.getName () + "' WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );
			
			ps.executeUpdate ();		
			
			iu.setName ( niu.getName () );
			
			return iu;
		}
		
		else if ( i == 2 ) { // for password
			
			ps = con.prepareStatement ( "UPDATE InstagramUser SET PASSWORD = '" + niu.getPassword () + "' WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );
			
			ps.executeUpdate ();		
			
			iu.setPassword ( niu.getPassword () );
			
			return iu;
			
		}
		else if ( i == 3 ) { // for email
			
			ps = con.prepareStatement ( "UPDATE InstagramUser SET EMAIL = '" + niu.getEmail () + "' WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );
			
			ps.executeUpdate ();		
			
			iu.setEmail ( niu.getEmail () );
			
			return iu;
			
		}
		else if ( i == 4 ) { // for address
			
			ps = con.prepareStatement ( "UPDATE InstagramUser SET ADDRESS = '" + niu.getAddress () + "' WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );
			
			ps.executeUpdate ();		
			
			iu.setAddress ( niu.getAddress () );
			
			return iu;
			
		}		
		
		return null;		
	}
	
	@Override
	public InstagramUser verifyProfileDAO (InstagramUser iu) throws InstagramException {

		try {
		
			// logic to view profile
			
			// load driver
			
			Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
					
			// get connection to database
					
			Connection con = DriverManager.getConnection ( "jdbc:derby:d:/database/instagram", "ashutosh", "4159" );
					
			// prepare query
					
			PreparedStatement ps = con.prepareStatement ( "SELECT * FROM InstagramUser WHERE NAME = '" + iu.getName() + "' and PASSWORD = '" + iu.getPassword () + "'" );
			
			// execute Query
			
			ResultSet rs = ps.executeQuery ();
			
			if ( rs.next () ) {
				
				iu.setEmail ( rs.getString ( 3 ) );
				iu.setAddress ( rs.getString ( 4 ) );
				
				return iu;
			}
		}
		catch ( SQLException | ClassNotFoundException sql ) {
			
			sql.printStackTrace ();
			
		}
		
		throw new InstagramException ();
	}

	public Map < String, List < InstagramUser > > profileHistoryDAO () throws Exception {
		
		Map < String, List < InstagramUser > > history = new HashMap < String, List < InstagramUser > > () ;
		
		List < InstagramUser > iul = viewAllProfileDAO ();
		history.put ( "a", iul );
		
		iul = viewAllProfileDAO ();
		history.put ( "b", iul );
		
		return history;
	}
	
} // end of view profile function
