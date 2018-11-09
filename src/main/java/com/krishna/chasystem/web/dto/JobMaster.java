package com.krishna.chasystem.web.dto;

import java.sql.Date;


public class JobMaster {

	private String jobNumber;
	private String importOrExport;
	private int branchCode;
	private String shipName;
	private String dispatchFrom;
	private String dispatchTo;
	private String port;
	private String beNo;
	private String city;
	private String partyRefNo;
	private String commodity;
	private int unitId;
	private double quantity;
	private Date jobCreationDate;
	private long userId;
	private String jobCompleted;
	private double advanceAmount;
	private String narration;
	private String turnKey;
	private int yearCode;
	private String accountCode;
	private String placeOfService;
	private int creditDays;
	
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
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
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
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
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public double getAdvanceAmount() {
		return advanceAmount;
	}
	public void setAdvanceAmount(double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public String getTurnKey() {
		return turnKey;
	}
	public void setTurnKey(String turnKey) {
		this.turnKey = turnKey;
	}
	
	public int getYearCode() {
		return yearCode;
	}
	public void setYearCode(int yearCode) {
		this.yearCode = yearCode;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getPlaceOfService() {
		return placeOfService;
	}
	public void setPlaceOfService(String placeOfService) {
		this.placeOfService = placeOfService;
	}
	public int getCreditDays() {
		return creditDays;
	}
	public void setCreditDays(int creditDays) {
		this.creditDays = creditDays;
	}
	@Override
	public String toString() {
		return "JobMaster [jobNumber=" + jobNumber + ", importOrExport=" + importOrExport + ", branchCode=" + branchCode
				+ ", shipName=" + shipName + ", dispatchFrom=" + dispatchFrom + ", dispatchTo=" + dispatchTo + ", port="
				+ port + ", beNo=" + beNo + ", city=" + city + ", partyRefNo=" + partyRefNo + ", commodity=" + commodity
				+ ", unitId=" + unitId + ", quantity=" + quantity + ", jobCreationDate=" + jobCreationDate + ", userId="
				+ userId + ", jobCompleted=" + jobCompleted + ", advanceAmount=" + advanceAmount + ", narration="
				+ narration + ", turnKey=" + turnKey + ", yearCode=" + yearCode + ", accountCode=" + accountCode
				+ ", placeOfService=" + placeOfService + ", creditDays=" + creditDays + "]";
	}
}
