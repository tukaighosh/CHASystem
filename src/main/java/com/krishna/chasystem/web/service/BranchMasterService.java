package com.krishna.chasystem.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BranchMasterService {

	public List<String> getBranchMasterList()
	{
		List<String> listOfBranch = new ArrayList<String>();
		listOfBranch.add("001-Kolkata");
		listOfBranch.add("002-Mumbai");
		listOfBranch.add("003-Chennai");
		listOfBranch.add("004-Bangalore");
		return listOfBranch;
	}
}
