package com.factory;

import com.dao.DAOLayer;

public class DAOFactory {
	
	private DAOFactory () {}
	
	public static DAOLayer createObject () {
		
		return new DAOLayer ();
	}

}
