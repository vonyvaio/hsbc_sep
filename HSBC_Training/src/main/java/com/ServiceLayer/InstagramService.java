package com.ServiceLayer;

import java.util.List;
import java.util.Map;

import com.DAOLayer.Instagram_DAO_Interface;

import com.entity.InstagramUser;
import com.utility.DAOFactory;
import com.utility.InstagramException;

public class InstagramService implements Instagram_Service_Interface {
	
	private Instagram_DAO_Interface is;
	
	public InstagramService () {
		
		is = DAOFactory.createObject ( "admin" );
	}

	@Override
	public int createProfileServiceInFile ( InstagramUser iu ) {
		
		return 1;
		
	}
	
	
	@Override
	public int createProfileService ( InstagramUser iu ) {
		
		return is.createProfileDAO ( iu );
		
	}

	@Override
	public int deleteProfileService ( InstagramUser iu ) throws Exception {

		return is.deleteProfileDAO ( iu );
		
	}

	@Override
	public InstagramUser viewProfileService ( InstagramUser iu ) throws Exception {
		 
		return is.viewProfileDAO ( iu );
		
	}

	@Override
	public List <InstagramUser> searchProfileService ( InstagramUser iu ) throws Exception {
		
		return is.searchProfileDAO ( iu );
		
	}

	@Override
	public List <InstagramUser> viewAllProfileService () throws Exception {
		
		return is.viewAllProfileDAO ();
		
	}
	
	@Override
	public InstagramUser editProfileService ( InstagramUser niu, InstagramUser iu, int i ) throws Exception {
		
		return is.editProfileDAO ( niu, iu, i );
	}


	@Override
	public InstagramUser verifyProfileService(InstagramUser iu) throws InstagramException {
			
		return is.verifyProfileDAO ( iu );
	}
	
	@Override
	public Map < String, List < InstagramUser > > profileHistoryService () throws Exception {
		
		return is.profileHistoryDAO ();
	}

}
