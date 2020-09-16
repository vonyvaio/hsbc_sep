package com.interface_demo.Service;

import com.interface_demo.dao.*;

public class FacebookService implements Facebook_Service_Interface {
	
	private Facebook_DAO_Interface fd;
	
	public FacebookService () {
		
		fd = new FacebookDAO ();
	}
	
	@Override
	public void createProfileService() {
		
		fd.createProfileDAO ();
		System.out.println ( "Create Profile Service Accessed" );		
	}

	@Override
	public void deleteProfileService() {
		
		fd.deleteProfileDAO();
		System.out.println ( "Delete Profile Service Accessed" );
		
	}

	@Override
	public void viewProfileService() {
		
		fd.viewProfileDAO ();
		System.out.println ( "View Profile Service Accessed" );		
	}

	@Override
	public void searchProfileService() {
		
		fd.searchProfileDAO ();
		System.out.println ( "Search Profile Service Accessed" );
		
	}

	@Override
	public void viewAllProfileService() {
		
		fd.viewAllProfileDAO ();
		System.out.println ( "View All Profile Service Accessed" );
		
	}

	
}
