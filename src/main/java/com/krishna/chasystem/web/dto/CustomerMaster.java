package com.krishna.chasystem.web.dto;

public class CustomerMaster {
	
	private int customerId;
	private String accountCode;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	@Override
	public String toString() {
		return "CustomerMaster [customerId=" + customerId + ", accountCode=" + accountCode + "]";
	}
}
