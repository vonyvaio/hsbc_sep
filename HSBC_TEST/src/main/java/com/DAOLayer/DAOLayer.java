package com.DAOLayer;

import java.util.ArrayList;
import java.util.List;

import com.entity.*;

public class DAOLayer implements DAOLayerInterface {
	
		// DAO LAYER VARIABLES
	
	private List < Electronic > electronic_data;
	
	private List < FoodItem > food_item_data;
	
	private List < Apparel > apparel_data;
	
	
		// CONSTRUCTOR
	
	public DAOLayer () {
		
		electronic_data = new ArrayList < Electronic > ( );
		
		food_item_data = new ArrayList < FoodItem > ( );
		
		apparel_data = new ArrayList < Apparel > ( );
	}
	
	
		// DAO LAYER METHODS
	
	
	public int addItemDAO ( int category, Object o ) {
		
		if ( o instanceof Electronic ) {
			
			electronic_data.add ( ( Electronic ) o );
			
			return 1;
		}
		
		if ( o instanceof FoodItem ) {
			
			food_item_data.add ( ( FoodItem ) o );
			
			return 1;
		}
		
		
		if ( o instanceof Apparel ) {
			
			apparel_data.add ( ( Apparel ) o );
			
			return 1;
		}
		
		return 0; // return if item could not be added
	}
	
	
	@Override
	public Object ViewItems ( int category ) {
		
		Object o = null;
		
		if ( category == 1 ) { // for electronic
			
			return (Object) electronic_data;
		}
		
		if ( category == 2 ) {	// for food item
			
			return (Object) food_item_data;
		}
		
		if ( category == 3 ) { // for apparel
			
			return (Object) apparel_data;
		}
		
		return o;
	}
}
