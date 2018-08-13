package com.krishna.chasystem.web.dto;

public class BranchMaster {

	private int branchCode;
	private String branchName;
	
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	@Override
	public String toString() {
		return "Branch [branchCode=" + branchCode + ", branchName="
				+ branchName + "]";
	}
}
