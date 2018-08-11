package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.BankMaster;
import com.krishna.chasystem.web.repository.BankMasterRepository;

@Service
public class BankMasterService {
	@Autowired
	BankMasterRepository bankMasterRepository;
	
	public List<BankMaster> getBankMasterList() throws ClassNotFoundException, SQLException
	{
		return bankMasterRepository.getBankMasterList();
	}
	
	public long getNextBankCodeFromSequence() throws ClassNotFoundException, SQLException
	{
		return bankMasterRepository.getNextBankCodeFromSequence();
	}
}
