package com.DAO;

import java.util.List;

public interface irctcDAOInterface {
	
	public List < String > returnTrainStation ( String country, String keyword );

	public List < String > returnCountry ();
}
