package com.krishna.chasystem.web.dto;



public class CompanyMaster {

	private String companyCode;
	private String companyName;
	private int yearCode;
	
	
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getYearCode() {
		return yearCode;
	}
	public void setYearCode(int yearCode) {
		this.yearCode = yearCode;
	}
	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName="
				+ companyName + ", yearCode=" + yearCode + "]";
	}
}
