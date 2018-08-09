package com.krishna.chasystem.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.CompanyMaster;
import com.krishna.chasystem.web.repository.CompanyMasterRepository;

@Service
public class CompanyMasterService {

	@Autowired
	CompanyMasterRepository companyMasterRepository;
	
	public List<CompanyMaster> getAllCompanyMasterList()
	{
		return companyMasterRepository.getAllCompanyMasterList();
	}
	
}
