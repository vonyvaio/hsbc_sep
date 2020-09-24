package com.sort;

import java.util.Comparator;

import com.entity.Electronic;

public class sortBySoldElectronic implements Comparator < Electronic > {

	@Override
	public int compare(Electronic arg0, Electronic arg1) {
		
		if ( arg0.getSold () < arg1.getSold () )
			return 1;
		
		if ( arg0.getSold () == arg1.getSold () )
			return 0;
			
		return -1;				
	}
}
