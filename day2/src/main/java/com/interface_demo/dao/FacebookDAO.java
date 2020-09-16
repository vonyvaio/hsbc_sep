package com.interface_demo.dao;


public class FacebookDAO implements Facebook_DAO_Interface {

	@Override
	public void createProfileDAO () {
		
		System.out.println ( "Accessing Database for creating profile" );
		
	}

	@Override
	public void deleteProfileDAO() {
		
		System.out.println ( "Accessing Database for deleting profile" );
		
	}

	@Override
	public void viewProfileDAO() {
		
		System.out.println ( "Accessing Database for viewing profile" );
		
	}

	@Override
	public void searchProfileDAO() {
		
		System.out.println ( "Accessing Database for searching profile" );
		
	}

	@Override
	public void viewAllProfileDAO() {
		
		System.out.println ( "Accessing Database for viewing all profiles" );
		
	}
	


}
