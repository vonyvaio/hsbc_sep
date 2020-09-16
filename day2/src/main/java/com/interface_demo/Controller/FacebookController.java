package com.interface_demo.Controller;

import com.interface_demo.Service.*;

public class FacebookController implements Facebook_Controller_Interface {
	
	private Facebook_Service_Interface fs;

	public FacebookController () {
		
		fs = new FacebookService ();
	}
	
	@Override
	public void createProfile() {
		
		fs.createProfileService ();
		System.out.println ( "Profile Created" );		
	}

	@Override
	public void deleteProfile() {

		fs.deleteProfileService ();
		System.out.println ( "Profile Deleted" );
	}

	@Override
	public void viewProfile() {

		fs.viewProfileService ();
		System.out.println ( "Viewing Profile" );		
	}

	@Override
	public void searchProfile() {

		fs.searchProfileService ();
		System.out.println( "Profile Search Completed" );		
	}

	@Override
	public void viewAllProfile() {
		
		fs.viewAllProfileService ();
		System.out.println( "Viewing All Profile");		
	}

}
