package com.krishna.chasystem.web.model;

import org.springframework.stereotype.Component;

@Component
public class LoginPageModel {

	private String userName;
	private String password;
	private String accountingYearCode;
	private String branch;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
		return "LoginPageModel [userId=" + userName + ", password=" + password
				+ ", accountingYearCode=" + accountingYearCode + ", branch="
				+ branch + "]";
	}
}
