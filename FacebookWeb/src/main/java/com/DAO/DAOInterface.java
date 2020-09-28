package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.*;

public class DAOInterface implements DAOLayerInterface {

	private Connection con;
	
	public DAOInterface () {
		
		try {
			
			// load driver
			
			Class.forName ( "org.apache.derby.jdbc.EmbeddedDriver" );
			
			// get connection to database
			
			con = DriverManager.getConnection ( "jdbc:derby:d:/database/facebook", "ashutosh", "4159" );
						
						
		} catch ( ClassNotFoundException | SQLException e ) {
			
			e.printStackTrace ();
		}
	}
	
	
	@Override
	public List < info > FriendList ( info user ) {
		
		List < info > user_list = new ArrayList < info > ();
		
		info i = new info ();
		
			// add first user ( hard code )
		
		i.setName ( "poiuyt" );
		i.setEmail ( "poiuyt@lom.com" );
		user_list.add ( i );

			// add second user
		
		i = new info ();
		
		i.setName ( "qrst" );
		i.setEmail ( "qrst@qrs.com" );
		user_list.add ( i );
		
		return user_list;		
	}
	
	@Override
	public int loginProfile ( info user ) {
		
		try {
		
			// 	prepare query
		
			PreparedStatement ps = con.prepareStatement ( "SELECT * FROM FacebookUser where NAME = ? and PASSWORD = ?" );
		
			ps.setString ( 1, user.getName () );
			ps.setString ( 2, user.getPassword() );
			
			ResultSet rs = ps.executeQuery ();
			
			if ( rs.next () ) {
				
				return 1;
			}
			
		} catch ( SQLException e ) {
			
			e.printStackTrace ();
		}
		
		return 0;
	}
	
	
	@Override
	public int createProfile ( info user ) {
		
		try {			
			
			// prepare query
			
			PreparedStatement ps = con.prepareStatement ( "INSERT INTO FacebookUser VALUES (?,?,?,?)" );
			
			ps.setString ( 1, user.getName() );
			ps.setString ( 2, user.getPassword() );
			
			ps.setString ( 3, user.getEmail() );
			ps.setString ( 4, user.getPhone() );
			
			// execute query
			
			if ( ps.executeUpdate () > 0 ) {
				
				con.close ();
				return 1;
			}
			
			con.close ();		
		}
		
		catch ( SQLException sql ) {
			
			sql.printStackTrace ();
		}
		
		return 0;

	} // end of createProfile class

}
