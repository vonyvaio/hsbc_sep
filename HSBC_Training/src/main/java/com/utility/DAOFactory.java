package com.utility;

import com.DAOLayer.InstagramDAO;
import com.DAOLayer.Instagram_DAO_Interface;

public class DAOFactory {
	
	private DAOFactory () {};
	
	public static Instagram_DAO_Interface createObject ( String s ) {
		
		if ( s.contentEquals ( "admin" ) ) {
			
			return ( new InstagramDAO () );
		}
		
		return null;
	}

}
