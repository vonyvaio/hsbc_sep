package com.BusinessLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

import com.DAOLayer.*;
import com.entity.*;
import com.sort.*;

public class BusinessLayer implements BusinessLayerInterface {
	
	private DAOLayerInterface id;

		// constructor
	
	public BusinessLayer () {
		
		id = new DAOLayer ();
	}

	@Override
	public void addItems () {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		Object o = null;
		
		try {			
			
			System.out.println ( "Enter Category of item to be added ( 1 for Electronic, 2 for Food, 3 for Apprel ): " );
			int category = Integer.parseInt ( br.readLine () );
			
			if ( category == 1 ) { // if electronic item
				
				Electronic e = new Electronic ();
				
				System.out.println ( "Enter Item Code: " );
				e.setItemCode ( br.readLine () );
				
				System.out.println ( "Enter Item Name: " );
				e.setItemName ( br.readLine () );
				
				System.out.println ( "Enter Unit Price: " );
				e.setUnitPrice ( Integer.parseInt ( br.readLine () ) );
				
				System.out.println ( "Enter Unit Quantity: " );
				e.setItemQuantity ( Integer.parseInt ( br.readLine () ) );
				
				System.out.println ( "Enter Warranty: " );
				e.setItemWarranty ( Integer.parseInt ( br.readLine () ) );
				
				System.out.println ( "Enter No of Items Sold: " );
				e.setSold ( Integer.parseInt ( br.readLine () ) );
				
				o = ( Object ) e;
			}
			
			else if ( category == 2 ) { // if food_item
				
				FoodItem f = new FoodItem ();
				
				System.out.println ( "Enter Item Code: " );
				f.setItemCode ( br.readLine () );
				
				System.out.println ( "Enter Item Name: " );
				f.setItemName ( br.readLine () );
				
				System.out.println ( "Enter Unit Price: " );
				f.setUnitPrice ( Integer.parseInt ( br.readLine () ) );
				
				System.out.println ( "Enter Date Of Manufacturing: " );
				f.setDateOfManufacturing ( br.readLine () );
				
				System.out.println ( "Enter Date of Expiry: " );
				f.setDateOfExpiry  ( br.readLine () );
				
				System.out.println ( "Enter No of Items Sold: " );
				f.setSold ( Integer.parseInt ( br.readLine () ) );
				
				System.out.println ( "Food Vegiterian? (Enter 1 for yes) " );
				int i = Integer.parseInt ( br.readLine () );  
				if ( i == 1 ) {
					
					f.setVegetarian ( true );
				}else {
					
					f.setVegetarian ( false );
				}
				
				o = ( Object ) f;
			}
			
			else { // if apparel item
				
				Apparel a = new Apparel ();
				
				System.out.println ( "Enter Item Code: " );
				a.setItemCode ( br.readLine () );
				
				System.out.println ( "Enter Item Name: " );
				a.setItemName ( br.readLine () );
				
				System.out.println ( "Enter Unit Price: " );
				a.setUnitPrice ( Integer.parseInt ( br.readLine () ) );
				
				System.out.println ( "Enter Size: " );
				a.setItemSize ( br.readLine () );
				
				System.out.println ( "Enter Material: " );
				a.setItemMaterial ( br.readLine () );
				
				System.out.println ( "Enter Quantity: " );
				a.setItemQuantity ( br.readLine () );
				
				System.out.println ( "Enter No of Items Sold: " );
				a.setSold ( Integer.parseInt ( br.readLine () ) );
				
				o = ( Object ) a;
			}
			
			if ( id.addItemDAO ( category, o ) == 1 ) {
				
				System.out.println ( "Item added successfully" );
				
			}else {
				
				System.out.println ( "Item Cannot be added/ ERROR" );
			}
		
		} catch ( IOException io ) {
			
			io.printStackTrace ();
		}
	}


	@Override
	public void viewItems () {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		
		Object o = null;
		
		System.out.println ( "Enter Category of item to be Viewd ( 1 for Electronic, 2 for Food, 3 for Apprel ): " );
		
		try {
		
			int category = Integer.parseInt ( br.readLine () );
			
			if ( category == 1 ) { // for electronic
				
				o = id.ViewItems ( 1 );
								
				List < Electronic > e = ( List < Electronic > ) o;
				
				for ( Electronic ee : e ) {
					
					System.out.println ("\nItem Code: " + ee.getItemCode () );
					System.out.println ("Item Name: " + ee.getItemName () );
					System.out.println ("Item Price: " + ee.getUnitPrice () );
					System.out.println ("Item Quantity: " + ee.getItemQuantity () );
					System.out.println ("Item Warrenty: " + ee.getItemWarranty () );
					System.out.println ("Item Sold: " + ee.getSold()  );
					System.out.println ("\n");					
				}				
			}
			
			if ( category == 2 ) {	// for food item
				
				o = id.ViewItems ( 2 );
				
				System.out.println ("\n ");
				System.out.println (" \n");
			}
			
			if ( category == 3 ) { // for apparel
				
				o = id.ViewItems ( 3 );
				
				System.out.println ("\n ");
				System.out.println (" \n");
			}
		
		}catch ( IOException io ) {
			
			io.printStackTrace ();
		}
		
	}


	@Override
	public void viewReport () {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
		
		Object o = null;
		
		System.out.println ( "Enter Category of item to be Viewd ( 1 for Electronic, 2 for Food, 3 for Apprel ): " );
		
		try {
		
			int category = Integer.parseInt ( br.readLine () );
			
				// only done for electronics
			
			if ( category == 1 ) { // for electronic
				
				o = id.ViewItems ( 1 );
								
				List < Electronic > e = ( List < Electronic > ) o;
				
				Collections.sort ( e, new sortBySoldElectronic () );
				
				for ( Electronic ee : e ) {
					
					System.out.println ("\nItem Code: " + ee.getItemCode () );
					System.out.println ("Item Name: " + ee.getItemName () );
					System.out.println ("Item Price: " + ee.getUnitPrice () );
					System.out.println ("Item Quantity: " + ee.getItemQuantity () );
					System.out.println ("Item Warrenty: " + ee.getItemWarranty () );
					System.out.println ("Item Sold: " + ee.getSold()  );
					System.out.println ("\n");					
				}				
			}
			
		}catch ( IOException io ) {
			
			io.printStackTrace ();
		}
	}
	
	
} // end of main class
