package com.day2;

public class Static_demo1 {
	
	// test static class
	
	static void test_static () {

		// trying to call external static method
		
		Static_demo2.method1(); // can be called using class name
		
		// trying to call external non-static method
		
		// Static_demo2.method2(); // cant be called directly, error
		
		Static_demo2 s = new Static_demo2 ();
		s.method2 (); // can be called via object
	}
	
	// test non-static class
	
	void test_non_static () {
		
		// trying to call external static method
		
		Static_demo2.method1 (); // can be called directly
		
		// trying to call external non-static method
		
		// Static_demo2.method2 (); // cant be directly, error
		
		Static_demo2 s = new Static_demo2 ();
		s.method2 (); // can be called via object		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
