package com.utility;

import com.ControllerLayer.InstagramController;
import com.ControllerLayer.Instagram_Controller_Interface;

public class ControllerFactory {
	
	private ControllerFactory () {};

	public static Instagram_Controller_Interface createObject ( String s ) {
		
		if ( s.contentEquals ( "admin" ) ) {
			
			return ( new InstagramController () );
		}
		
		return null;
	}
}
