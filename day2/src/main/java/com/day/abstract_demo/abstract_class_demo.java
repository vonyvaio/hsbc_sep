package com.day.abstract_demo;

	// parent class

abstract class shape {
	
	String colour = "red";
	
	abstract void dimension ();
	
	String fill_colour () {
		
		return colour;
	}
		
} // end of shape class


	// child classes

class square extends shape {
	
	int side;
	
		// constructor to initialize square shape
	
	square ( int a ) {
		
		side = a;
	}
	
	void dimension () {		
		
		System.out.println ( "Side of square is: " + side );
	}
	
} // class square



class circle extends shape {
	
	int radius;
	
	
	circle ( int r ) {
		
		radius = r;
		
	}
	
	void dimension () {		
		
		System.out.println ( "Radius of square is: " + radius );
	}

	@Override
	String fill_colour () {
		
		colour = "Green";
		
		return colour;
	}
	

} // class circle


	// DRIVER CODE


public class abstract_class_demo {

	public static void main(String[] args) {
		
		// test 1
		
		System.out.println ( "\n TEST 1 \n" );
	
		// shape s = new shape (); // can't instantiate abstract class,error
		
		shape s = new square (5);
		
		System.out.println ( "The colour is " + s.colour );
		s.dimension ();
		
	
		// test 2
		
		System.out.println ( "\n TEST 2 \n" );
		
		shape s2 = new circle (8);
		System.out.println ( "The colour is " + s2.fill_colour() );
		s2.dimension ();

		
		// test 3
		
		System.out.println ( "\n TEST 3 \n" );
		
		circle c = new circle (10);
		System.out.println ( "The colour is " + c.colour );
		c.dimension ();
	}

}
