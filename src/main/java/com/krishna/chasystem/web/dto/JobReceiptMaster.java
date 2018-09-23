package com.krishna.chasystem.web.dto;

import java.sql.Date;


public class JobReceiptMaster {

	private String jobNumber;
	private Date jobDate;
	private Date invoiceDate;
	private String receiptNumber;
	private Date receiptDate;
	private double receiptAmount;
	private String receiptDetail;
	private String billNo;
	private Date runDate;
	private String lrNumber;
	private Date lrDate;
	private String invoiceNo;
	private String userId;
	private String branchCode;
	private long id;
	private short expenseCode;
	private String accountCode;
	private String bankAccountCode;
	private String paymentMode;
	private String chequeNumber;
	private String rtgsNumber;
	
	
	
	
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
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}
	public Date getJobDate() {
		return jobDate;
	}
	public void setJobDate(Date jobDate) {
		this.jobDate = jobDate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public Date getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(Date rRdt) {
		this.receiptDate = rRdt;
	}
	public double getReceiptAmount() {
		return receiptAmount;
	}
	public void setReceiptAmount(double receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptDetail() {
		return receiptDetail;
	}
	public void setReceiptDetail(String receiptDetail) {
		this.receiptDetail = receiptDetail;
	}
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public Date getRunDate() {
		return runDate;
	}
	public void setRunDate(Date runDate) {
		this.runDate = runDate;
	}
	public String getLrNumber() {
		return lrNumber;
	}
	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}
	public Date getLrDate() {
		return lrDate;
	}
	public void setLrDate(Date lrDate) {
		this.lrDate = lrDate;
	}
	public short getExpenseCode() {
		return expenseCode;
	}
	public void setExpenseCode(short expenseCode) {
		this.expenseCode = expenseCode;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getBankAccountCode() {
		return bankAccountCode;
	}
	public void setBankAccountCode(String bankAccountCode) {
		this.bankAccountCode = bankAccountCode;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentmode) {
		this.paymentMode = paymentmode;
	}
	public String getChequeNumber() {
		return chequeNumber;
	}
	public void setCheque_number(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getRtgsNumber() {
		return rtgsNumber;
	}
	public void setRtgsNumber(String rtgsNumber) {
		this.rtgsNumber = rtgsNumber;
	}
	@Override
	public String toString() {
		return "JobReceiptMaster [jobNumber=" + jobNumber + ", jobDate=" + jobDate + ", invoiceDate=" + invoiceDate
				+ ", receiptNumber=" + receiptNumber + ", receiptDate=" + receiptDate + ", receiptAmount="
				+ receiptAmount + ", receiptDetail=" + receiptDetail + ", billNo=" + billNo + ", runDate=" + runDate
				+ ", lrNumber=" + lrNumber + ", lrDate=" + lrDate + ", invoiceNo=" + invoiceNo + ", userId=" + userId
				+ ", branchCode=" + branchCode + ", id=" + id + ", expenseCode=" + expenseCode + ", accountCode="
				+ accountCode + ", bankAccountCode=" + bankAccountCode + ", payment_mode=" + paymentMode
				+ ", cheque_number=" + chequeNumber + ", rtgsNumber=" + rtgsNumber + "]";
	}
}
