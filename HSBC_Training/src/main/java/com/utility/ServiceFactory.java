package com.utility;

import com.ServiceLayer.InstagramService;
import com.ServiceLayer.Instagram_Service_Interface;

public class ServiceFactory {
	
		// private constructor
		
	private ServiceFactory () {}
	
	public static Instagram_Service_Interface createObject ( String s ) {
		
		if ( s.contentEquals ( "admin" ) ) {
			
			return ( new InstagramService () );
		}
		
		return null;
	}

}
