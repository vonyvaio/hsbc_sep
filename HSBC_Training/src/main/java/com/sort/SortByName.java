package com.sort;

import java.util.Comparator;

import com.entity.InstagramUser;

public class SortByName implements Comparator < InstagramUser > {

	@Override
	public int compare(InstagramUser arg0, InstagramUser arg1) {
		
		return arg0.getName().compareTo ( arg1.getName () );		
	}

}
