package com.krishna.chasystem.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.CustomerMaster;
import com.krishna.chasystem.web.repository.CustomerMasterRepository;

@Service
public class CustomerMasterService {

	@Autowired
	CustomerMasterRepository customerMasterRepository;
	
	public List<CustomerMaster> getAllCustomerMasterList()
	{
		return customerMasterRepository.getAllCustomerMasterList();
	}
}
