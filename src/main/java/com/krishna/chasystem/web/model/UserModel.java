package com.krishna.chasystem.web.model;

import org.springframework.stereotype.Component;

@Component
public class UserModel {

	private String userId;
	private String password;
	private String accountingYear;
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
	public String getAccountingYear() {
		return accountingYear;
	}
	public void setAccountingYear(String accountingYear) {
		this.accountingYear = accountingYear;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", password=" + password + ", accountingYear=" + accountingYear
				+ ", branch=" + branch + "]";
	}
}
