package com.day2;

public class Static_demo2 {
	
		// static method
	
	public static void method1 () {
		
		System.out.println ( "I am static method1" );
	}
	
		// non-static method
	
	public void method2 () {
		
		System.out.println ( "I am non-static method2" );
	}
	
		// test non-static function

	void test_non_static () {
		
		// trying to call non static method
		
		method2 (); // can be called directly
		
		
		// trying to call static method
		
		method1 (); // can be called directly
	}
	
	
		// test static function
		
	static void  test_static () {
		
		// trying to call non static method
		
		// method2 ();	// cant be called, giving error
		
		Static_demo2 s = new Static_demo2 ();
		s.method2 (); // can be called via object
		
		// trying to call static
		
		method1 (); // can be called directly
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
