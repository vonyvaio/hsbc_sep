package com.service;

import java.util.List;

import com.entity.*;

public interface serviceLayerInterface {
	
	public int createProfile ( info user );
	
	public int loginProfile ( info user );
	
	public List < info > FriendList ( info user );
	
	public int checkForValidEmail ( String email );
	
}
