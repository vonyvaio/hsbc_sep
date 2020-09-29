package com.service;

import java.util.List;

import com.DAO.*;
import com.factory.DAOFactory;

import com.entity.*;

public class serviceInterface implements serviceLayerInterface {

	private DAOLayerInterface dao;
	
	public serviceInterface () {
		
		dao = DAOFactory.createObject ();
	}

	@Override
	public List < info > FriendList ( info user ) {
		
		return dao.FriendList ( user );
	}
	
	@Override
	public int loginProfile ( info user ) {
		
		return dao.loginProfile ( user );
	}
	
	@Override
	public int createProfile ( info user ) {
		
		return dao.createProfile ( user );		
	}
	
	@Override
	public int checkForValidEmail ( String email ) {
		
		return dao.checkForValidEmail ( email );
	}

}
