package com.factory;

import com.DAO.*;

public class DAOFactory {
	
	public static DAOInterface createObject () {
		
		return new DAOInterface ();
	}

}
