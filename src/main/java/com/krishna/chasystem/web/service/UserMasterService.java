package com.krishna.chasystem.web.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.User;
import com.krishna.chasystem.web.repository.UserMasterRepository;

@Service
public class UserMasterService {
	@Autowired
	UserMasterRepository userMasterRepo;
	
	public boolean isAuthenticatedUser(User user) throws ClassNotFoundException, SQLException
	{
		return userMasterRepo.isAuthenticatedUser(user);
	}

}
