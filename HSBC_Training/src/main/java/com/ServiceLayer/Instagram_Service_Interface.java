package com.ServiceLayer;

import java.util.List;
import java.util.Map;

import com.entity.InstagramUser;
import com.utility.InstagramException;

public interface Instagram_Service_Interface {

	int createProfileService ( InstagramUser iu );
	
	int createProfileServiceInFile ( InstagramUser iu );

	int deleteProfileService ( InstagramUser iu ) throws Exception;

	InstagramUser viewProfileService ( InstagramUser iu ) throws Exception;

	List <InstagramUser> searchProfileService ( InstagramUser iu ) throws Exception;

	List <InstagramUser> viewAllProfileService () throws Exception;
	
	InstagramUser editProfileService ( InstagramUser niu, InstagramUser iu, int i ) throws Exception;
	
	InstagramUser verifyProfileService ( InstagramUser iu ) throws InstagramException ;
	
	Map < String, List < InstagramUser > > profileHistoryService () throws Exception;

}
