package com.krishna.chasystem.web.dto;

import org.springframework.stereotype.Component;

@Component
public class Master {

	private String accountCode;
	private String accountHead;
	
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
	@Override
	public String toString() {
		return "Master [accountCode=" + accountCode + ", accountHead=" + accountHead + "]";
	}
}
