package com.krishna.chasystem.web.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.JobMaster;
import com.krishna.chasystem.web.repository.JobMasterRepository;


@Service
public class JobMasterService {

	@Autowired
	JobMasterRepository jobMasterRepository;
	public int addJobMasterEntry(JobMaster jobMaster) throws ClassNotFoundException, SQLException
	{
		return jobMasterRepository.addJobMasterEntry(jobMaster);
	}
	
	public long getNextJobNumber() throws ClassNotFoundException, SQLException
	{
		return jobMasterRepository.getNextJobNumberFromSequence();
		
	}
	public int updateJobMasterEntry(JobMaster jobMaster) throws ClassNotFoundException, SQLException
	{
		return jobMasterRepository.updateJobMasterEntry(jobMaster);
	}
	public JobMaster getJobMasterById(String jobNumber) throws ClassNotFoundException, SQLException
	{
		return jobMasterRepository.getJobMasterById(jobNumber);
	}
	
}
