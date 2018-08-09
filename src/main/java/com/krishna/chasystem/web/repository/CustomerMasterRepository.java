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
		customerMaster.setAccountHead("AC-HEAD-1001");
		customerMaster.setAddressOfCommunicationId(1001);
		customerMaster.setCurrentAddressId(1002);
		customerMaster.setGstNumber("GDF-GHH-89229");
		customerMaster.setPermanentAddressId(1003);
		customerMasterList.add(customerMaster);
		
		customerMaster = new  CustomerMaster();
		customerMaster.setAccountCode("AC-102");
		customerMaster.setAccountHead("AC-HEAD-1002");
		customerMaster.setAddressOfCommunicationId(1002);
		customerMaster.setCurrentAddressId(1003);
		customerMaster.setGstNumber("FEA-GHH-12339");
		customerMaster.setPermanentAddressId(1004);
		customerMasterList.add(customerMaster);
		
		return customerMasterList;
	}

}
