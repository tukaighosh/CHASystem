package com.krishna.chasystem.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.ExpenseMaster;
import com.krishna.chasystem.web.repository.ExpenseMasterRepository;

@Service
public class ExpenseMasterService {
	
	@Autowired
	ExpenseMasterRepository expenseMasterRepo;
	
	public List<ExpenseMaster> getAllExpenseMasterRecords() {
		return expenseMasterRepo.getAllExpenseMasterRecords();
	}

}
