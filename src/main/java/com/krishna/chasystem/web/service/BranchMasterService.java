package com.krishna.chasystem.web.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BranchMasterService {

	
	public Map<String,String> getBranchMasterMap()
	{
		Map<String, String> branchMap = new HashMap<String, String>();
		branchMap.put("001","001-Kolkata");
		branchMap.put("002","002-Mumbai");
		branchMap.put("003","003-Chennai");
		branchMap.put("004","004-Bangalore");
		return branchMap;
	}
}
