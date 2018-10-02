package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.CompanyMaster;
import com.krishna.chasystem.web.repository.CompanyMasterRepository;

@Service
public class CompanyMasterService {

	@Autowired
	CompanyMasterRepository companyMasterRepository;
	
	public List<CompanyMaster> getAllCompanyMasterList() throws ClassNotFoundException, SQLException
	{
		return companyMasterRepository.getAllCompanyMasterList();
	}
	
}
