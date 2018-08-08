package com.krishna.chasystem.web.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.JobReceiptMaster;
import com.krishna.chasystem.web.repository.JobReceiptRepository;

@Service
public class JobReceiptService {
	
	@Autowired
	JobReceiptRepository jobReceiptRepo;
	public int addJobReceiptEntry(JobReceiptMaster jobReceipt) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		return jobReceiptRepo.addJobReceiptEntry(jobReceipt);
	}

}
