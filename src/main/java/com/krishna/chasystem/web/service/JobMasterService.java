package com.krishna.chasystem.web.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.Job_Master;
import com.krishna.chasystem.web.repository.JobMasterRepository;


@Service
public class JobMasterService {

	@Autowired
	JobMasterRepository jobMasterRepository;
	public int addJobMasterEntry(Job_Master jobMaster) throws ClassNotFoundException, SQLException
	{
		return jobMasterRepository.addJobMasterEntry(jobMaster);
	}
	
	public long getNextJobNumber() throws ClassNotFoundException, SQLException
	{
		return jobMasterRepository.getNextJobNumberFromSequence();
		
	}
}
