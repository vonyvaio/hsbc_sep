package com.sort;

import java.util.Comparator;

import com.entity.InstagramUser;

public class SortByAddress implements Comparator < InstagramUser > {
	
	@Override
	public int compare(InstagramUser arg0, InstagramUser arg1) {
		
		return arg0.getAddress().compareTo ( arg1.getAddress () );		
	}

}
