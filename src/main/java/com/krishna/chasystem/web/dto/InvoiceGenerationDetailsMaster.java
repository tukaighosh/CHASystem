package com.krishna.chasystem.web.dto;

import java.sql.Date;

public class InvoiceGenerationDetailsMaster {

	private String invoiceNumber;
	private Date invoiceGenerationDate;
	private double productQuantity;
	private String unitOfMeasure;
	private double outgoingAmount;
	private String vehicleChallanNumber;
	private Date vehicleChallanDate;
	private String challanDetails;
	private String jobNumber;
	private double ratePerUnit;
	private String userId;
	private String branchCode;
	private long id;
	
	
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Date getInvoiceGenerationDate() {
		return invoiceGenerationDate;
	}
	public void setInvoiceGenerationDate(Date invoiceGenerationDate) {
		this.invoiceGenerationDate = invoiceGenerationDate;
	}
	public double getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(double productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public double getOutgoingAmount() {
		return outgoingAmount;
	}
	public void setOutgoingAmount(double outgoingAmount) {
		this.outgoingAmount = outgoingAmount;
	}
	public String getVehicleChallanNumber() {
		return vehicleChallanNumber;
	}
	public void setVehicleChallanNumber(String vehicleChallanNumber) {
		this.vehicleChallanNumber = vehicleChallanNumber;
	}
	public Date getVehicleChallanDate() {
		return vehicleChallanDate;
	}
	public void setVehicleChallanDate(Date vehicleChallanDate) {
		this.vehicleChallanDate = vehicleChallanDate;
	}
	public String getChallanDetails() {
		return challanDetails;
	}
	public void setChallanDetails(String challanDetails) {
		this.challanDetails = challanDetails;
	}
	public String getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	@Override
	public String toString() {
		return "InvoiceGenerationDetails [invoiceNumber=" + invoiceNumber + ", invoiceGenerationDate="
				+ invoiceGenerationDate + ", productQuantity=" + productQuantity + ", unitOfMeasure=" + unitOfMeasure
				+ ", outgoingAmount=" + outgoingAmount + ", vehicleChallanNumber=" + vehicleChallanNumber
				+ ", vehicleChallanDate=" + vehicleChallanDate + ", challanDetails=" + challanDetails + ", jobNumber="
				+ jobNumber + ", ratePerUnit=" + ratePerUnit + ", userId=" + userId + ", branchCode=" + branchCode
				+ ", id=" + id + "]";
	}
	
}
