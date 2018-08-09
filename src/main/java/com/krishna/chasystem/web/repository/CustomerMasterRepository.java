package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.CustomerMaster;

@Repository
public class CustomerMasterRepository {

	public List<CustomerMaster> getAllCustomerMasterList() {
		List<CustomerMaster> customerMasterList = new ArrayList<CustomerMaster>();
		
		CustomerMaster customerMaster = new  CustomerMaster();
		customerMaster.setAccountCode("AC-101");
		customerMaster.setCustomerId(1001);
		customerMasterList.add(customerMaster);
		
		customerMaster = new  CustomerMaster();
		customerMaster.setAccountCode("AC-102");
		
		customerMasterList.add(customerMaster);
		
		return customerMasterList;
	}

}
