package com.DAO;

import java.util.List;
import java.util.ArrayList;


public interface countryStateCityInterfaceLayer {
	
	public List < String > getCountry ( String Keyword );
	
	public List < String > getState ( String keyword, String country );
	
	public List < String > getCity ( String keyword, String state );

}
