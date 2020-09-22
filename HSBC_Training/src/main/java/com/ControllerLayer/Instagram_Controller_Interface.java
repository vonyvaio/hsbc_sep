package com.ControllerLayer;

import com.entity.InstagramUser;

public interface Instagram_Controller_Interface {

	void createProfile () throws Exception;

	void deleteProfile () throws Exception;

	void viewProfile () throws Exception;

	void searchProfile () throws Exception;

	void viewAllProfile () throws Exception;
	
	void editProfile () throws Exception;
	
	void displayProfile ( InstagramUser iu ) throws Exception;
	
	void profileHistory () throws Exception;
	
	void createProfileInFile () throws Exception;
	
	void viewProfileFromFile () throws Exception;
}
