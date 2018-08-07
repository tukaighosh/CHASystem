package com.krishna.chasystem.web.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class Job_Master {

	
	private String jobNumber;
	private String importOrExport;
	private String branchCode;
	private String vessel;
	private String dispatchFrom;
	private String dispatchTo;
	private String port;
	private String beNo;
	private String city;
	private String partyRefNo;
	private String commodity;
	private String unit;
	private double quantity;
	private Date jobCreationDate;
	private String userId;
	private String jobCompleted;
	
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getJobCompleted() {
		return jobCompleted;
	}
	public void setJobCompleted(String jobCompleted) {
		this.jobCompleted = jobCompleted;
	}
	public Date getJobCreationDate() {
		return jobCreationDate;
	}
	public void setJobCreationDate(Date jobCreationDate) {
		this.jobCreationDate = jobCreationDate;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	public String getImportOrExport() {
		return importOrExport;
	}
	public void setImportOrExport(String importOrExport) {
		this.importOrExport = importOrExport;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getVessel() {
		return vessel;
	}
	public void setVessel(String vessel) {
		this.vessel = vessel;
	}
	public String getDispatchFrom() {
		return dispatchFrom;
	}
	public void setDispatchFrom(String dispatchFrom) {
		this.dispatchFrom = dispatchFrom;
	}
	public String getDispatchTo() {
		return dispatchTo;
	}
	public void setDispatchTo(String dispatchTo) {
		this.dispatchTo = dispatchTo;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getBeNo() {
		return beNo;
	}
	public void setBeNo(String beNo) {
		this.beNo = beNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPartyRefNo() {
		return partyRefNo;
	}
	public void setPartyRefNo(String partyRefNo) {
		this.partyRefNo = partyRefNo;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Job_Master [jobNumber=" + jobNumber + ", importOrExport=" + importOrExport + ", branchCode="
				+ branchCode + ", vessel=" + vessel + ", dispatchFrom=" + dispatchFrom + ", dispatchTo=" + dispatchTo
				+ ", port=" + port + ", beNo=" + beNo + ", city=" + city + ", partyRefNo=" + partyRefNo + ", commodity="
				+ commodity + ", unit=" + unit + ", quantity=" + quantity + ", jobCreationDate=" + jobCreationDate
				+ ", userId=" + userId + ", jobCompleted=" + jobCompleted + "]";
	}
	
	
	
	
	
}
