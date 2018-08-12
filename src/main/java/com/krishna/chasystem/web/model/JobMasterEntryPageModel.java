package com.krishna.chasystem.web.model;

import org.springframework.stereotype.Component;

@Component
public class JobMasterEntryPageModel {

	private String jobNumber;
	private String accountCode;
	private String importOrExport;
	private String dispatchedFrom;
	private String dispatchedTo;
	private String portName;
	private String shipName;
	private String cityName;
	private String beNo;
	private String refNo;
	private String partyRefNo;
	private String creditDays;
	private String commodity;
	private String commodityQuantity;
	private String unitId;
	private String advanceAmount;
	private String turnKey;
	private String jobOrderNumber;
	private String branchCode;
	private String narration;
	
	
	public String getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getImportOrExport() {
		return importOrExport;
	}
	public void setImportOrExport(String importOrExport) {
		this.importOrExport = importOrExport;
	}
	public String getDispatchedFrom() {
		return dispatchedFrom;
	}
	public void setDispatchedFrom(String dispatchedFrom) {
		this.dispatchedFrom = dispatchedFrom;
	}
	public String getDispatchedTo() {
		return dispatchedTo;
	}
	public void setDispatchedTo(String dispatchedTo) {
		this.dispatchedTo = dispatchedTo;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getBeNo() {
		return beNo;
	}
	public void setBeNo(String beNo) {
		this.beNo = beNo;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getPartyRefNo() {
		return partyRefNo;
	}
	public void setPartyRefNo(String partyRefNo) {
		this.partyRefNo = partyRefNo;
	}
	public String getCreditDays() {
		return creditDays;
	}
	public void setCreditDays(String creditDays) {
		this.creditDays = creditDays;
	}
	
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getCommodityQuantity() {
		return commodityQuantity;
	}
	public void setCommodityQuantity(String commodityQuantity) {
		this.commodityQuantity = commodityQuantity;
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getAdvanceAmount() {
		return advanceAmount;
	}
	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public String getTurnKey() {
		return turnKey;
	}
	public void setTurnKey(String turnKey) {
		this.turnKey = turnKey;
	}
	public String getJobOrderNumber() {
		return jobOrderNumber;
	}
	public void setJobOrderNumber(String jobOrderNumber) {
		this.jobOrderNumber = jobOrderNumber;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	@Override
	public String toString() {
		return "JobMasterEntryPageModel [jobNumber=" + jobNumber + ", accountCode=" + accountCode + ", importOrExport="
				+ importOrExport + ", dispatchedFrom=" + dispatchedFrom + ", dispatchedTo=" + dispatchedTo
				+ ", portName=" + portName + ", shipName=" + shipName + ", cityName=" + cityName + ", beNo=" + beNo
				+ ", refNo=" + refNo + ", partyRefNo=" + partyRefNo + ", creditDays=" + creditDays + ", commodity="
				+ commodity + ", commodityQuantity=" + commodityQuantity + ", unitId=" + unitId + ", advanceAmount="
				+ advanceAmount + ", turnKey=" + turnKey + ", jobOrderNumber=" + jobOrderNumber + ", branchCode="
				+ branchCode + ", narration=" + narration + "]";
	}
}
