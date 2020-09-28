package com.factory;

import com.service.*;

public class serviceFactory {
	
	private serviceFactory () {}
	
	public static serviceInterface createObject () {
		
		return new serviceInterface ();
	}

}
