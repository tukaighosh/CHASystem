package com.krishna.chasystem.web.model;

import org.springframework.stereotype.Component;

@Component
public class LoginPageModel {

	private String userId;
	private String password;
	private String accountingYearCode;
	private String branch;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccountingYearCode() {
		return accountingYearCode;
	}
	public void setAccountingYearCode(String accountingYearCode) {
		this.accountingYearCode = accountingYearCode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "LoginPageModel [userId=" + userId + ", password=" + password
				+ ", accountingYearCode=" + accountingYearCode + ", branch="
				+ branch + "]";
	}
}
