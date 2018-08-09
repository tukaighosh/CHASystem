package com.krishna.chasystem.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.BankMaster;
import com.krishna.chasystem.web.repository.BankMasterRepository;

@Service
public class BankMasterService {
	@Autowired
	BankMasterRepository bankMasterRepository;
	
	public List<BankMaster> getBankMasterList()
	{
		return bankMasterRepository.getBankMasterList();
	}
}
