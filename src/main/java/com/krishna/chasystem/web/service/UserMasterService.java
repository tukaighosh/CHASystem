package com.krishna.chasystem.web.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.UserMaster;
import com.krishna.chasystem.web.repository.UserMasterRepository;

@Service
public class UserMasterService {
	@Autowired
	UserMasterRepository userMasterRepo;
	
	public UserMaster getAuthenticatedUser(UserMaster user) throws ClassNotFoundException, SQLException
	{
		return userMasterRepo.getAuthenticatedUser(user);
	}

}
