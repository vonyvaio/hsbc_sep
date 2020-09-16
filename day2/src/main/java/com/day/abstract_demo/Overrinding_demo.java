package com.day.abstract_demo;


	// parent class

class parent {
	
	
	static void static_function () {
		
		System.out.println ( "This is static function in parent class" );
	}
	
	void test_function_to_override () {
		
		System.out.println ( "This is test function in parent class to override in child class" );
	}
	
	void function1 () {
		
		System.out.println ( "This is exclusive function to parent class" );
	}
		
} // end of parent class


	// child class extending parent

class child extends parent {
	
//	@Override   // cannot override static function but overload it
	static void static_function () {
		
		System.out.println ( "This is overloaded static function in child class" );
	}
	
	@Override
	void test_function_to_override () {
		
		System.out.println ( "This is overrided function in child class" );
	}
	
	void function2 () {
		
		System.out.println ( "This is exclusive function to child class" );
	}
	
} // end of child class


	// DRIVER CODE

public class Overrinding_demo {

	public static void main(String[] args) {

			// test 1
		
		System.out.println ( "\n TEST 1 \n" );
		
		parent p = new parent ();
		
		parent.static_function ();
		p.test_function_to_override ();
		p.function1 ();
		

			// test 2
		
		System.out.println ( "\n TEST 2 \n" );
		
		parent z = new child ();	
		
		parent.static_function ();
		z.test_function_to_override ();
		z.function1 ();
		
		

			// test 3
		
		System.out.println ( "\n TEST 3 \n" );
		
		child c = new child ();
		
		child.static_function ();
		c.test_function_to_override ();
		c.function1 ();
		c.function2 ();

	}

}
