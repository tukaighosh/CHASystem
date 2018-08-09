package com.krishna.chasystem.web.dto;

public class CustomerMaster {

	private String accountCode;
	private String accountHead;
	private String gstNumber;
	private long currentAddressId;
	private long permanentAddressId;
	private long addressOfCommunicationId;
	
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountHead() {
		return accountHead;
	}
	public void setAccountHead(String accountHead) {
		this.accountHead = accountHead;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public long getCurrentAddressId() {
		return currentAddressId;
	}
	public void setCurrentAddressId(long currentAddressId) {
		this.currentAddressId = currentAddressId;
	}
	public long getPermanentAddressId() {
		return permanentAddressId;
	}
	public void setPermanentAddressId(long permanentAddressId) {
		this.permanentAddressId = permanentAddressId;
	}
	public long getAddressOfCommunicationId() {
		return addressOfCommunicationId;
	}
	public void setAddressOfCommunicationId(long addressOfCommunicationId) {
		this.addressOfCommunicationId = addressOfCommunicationId;
	}
	@Override
	public String toString() {
		return "CustomerMaster [accountCode=" + accountCode + ", accountHead="
				+ accountHead + ", gstNumber=" + gstNumber
				+ ", currentAddressId=" + currentAddressId
				+ ", permanentAddressId=" + permanentAddressId
				+ ", addressOfCommunicationId=" + addressOfCommunicationId + "]";
	}
}
