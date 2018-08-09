package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.BranchMaster;

@Repository
public class BranchMasterRepository {

	public List<BranchMaster> getBranchMasterMap() {
		List<BranchMaster> branchMasterList = new ArrayList<BranchMaster>();
		
		BranchMaster branchMaster = new BranchMaster();
		branchMaster.setBranchCode("SBI-1001");
		branchMaster.setBranchName("SBI Old Panvel");
		branchMasterList.add(branchMaster);
		
		branchMaster = new BranchMaster();
		branchMaster.setBranchCode("ICICI-1001");
		branchMaster.setBranchName("ICICI Thane West");
		branchMasterList.add(branchMaster);
		
		branchMaster = new BranchMaster();
		branchMaster.setBranchCode("HDFC-1001");
		branchMaster.setBranchName("HDFC Prabhadevi");
		branchMasterList.add(branchMaster);
		
		return branchMasterList;
	}

}
