package com.day2;

	// final class demo class

final class final_class {
	
	int a = 10;

}

	// final class cannot be inherited, error

/*
class inherit extends final_class {
	
	
}
*/


	// final method demo class

class final_method_class {
	
	int a = 1;
	
	final void final_method () {
		
		System.out.println ( "this is final method and cannot be overrirde " );
	}
} // end of final_method_class


	// extend final_method_class

class test_final_method_override_demo extends final_method_class {
	
	/*
	void final_method () {
		
		// cannot be override
	}
	
	*/
} // end of test_final_method_override_demo class

	// final variable class

public class final_class_demo {
	
	final int a = 10; // final variable can't be changed
	
		// test function to check for modifying final variable
	
	void test1 () {
		
		// a = 11; // can't be changed as variable is final
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
