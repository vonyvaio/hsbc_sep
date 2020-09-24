package com.factory;

import com.business.BusinessLayer;

public class BusinessFactory {
	
	private BusinessFactory () {}
	
	public static BusinessLayer createObject () {
		
		return new BusinessLayer ();
	}

}
