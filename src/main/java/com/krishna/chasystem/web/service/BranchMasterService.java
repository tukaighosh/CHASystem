package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.BranchMaster;
import com.krishna.chasystem.web.repository.BranchMasterRepository;

@Service
public class BranchMasterService {
	@Autowired
	BranchMasterRepository branchMasterRepository;
	
	public Map<Integer,String> getBranchMasterMap() throws ClassNotFoundException, SQLException
	{
		Map<Integer, String> branchMap = new TreeMap<Integer, String>();
		List<BranchMaster> branchMasterList = branchMasterRepository.getBranchMasterMap();
		for(BranchMaster branchMaster : branchMasterList)
		{
			branchMap.put(branchMaster.getBranchCode(), branchMaster.getBranchCode()+"-"+branchMaster.getBranchName());
		}
		return branchMap;
	}
}
