package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.CustomerMaster;
import com.krishna.chasystem.web.repository.CustomerMasterRepository;

@Service
public class CustomerMasterService {

	@Autowired
	CustomerMasterRepository customerMasterRepository;
	
	public List<CustomerMaster> getAllCustomerMasterList() throws ClassNotFoundException, SQLException
	{
		return customerMasterRepository.getAllCustomerMasterList();
	}
}
