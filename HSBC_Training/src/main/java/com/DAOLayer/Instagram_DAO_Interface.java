package com.DAOLayer;

import java.util.List;
import java.util.Map;

import com.entity.*;
import com.utility.InstagramException;

public interface Instagram_DAO_Interface {

	int createProfileDAO ( InstagramUser iu );

	int deleteProfileDAO ( InstagramUser iu ) throws Exception;

	List <InstagramUser> viewAllProfileDAO () throws Exception;

	List <InstagramUser> searchProfileDAO ( InstagramUser iu ) throws Exception;

	InstagramUser viewProfileDAO ( InstagramUser iu ) throws Exception;
	
	InstagramUser editProfileDAO ( InstagramUser niu, InstagramUser iu, int i ) throws Exception;
	
	InstagramUser verifyProfileDAO ( InstagramUser iu ) throws InstagramException;

	Map < String, List < InstagramUser > > profileHistoryDAO () throws Exception;
}
