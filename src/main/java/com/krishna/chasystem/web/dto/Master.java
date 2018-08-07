package com.krishna.chasystem.web.dto;

import org.springframework.stereotype.Component;

@Component
public class Master {

	private String accountCode;
	private String accountHead;
	private String currentDebit;
	private String currentCredit;
	private String schedule;
	private String balance;
	private String openingBalance;
	
	
	
	public String getCurrentDebit() {
		return currentDebit;
	}
	public void setCurrentDebit(String currentDebit) {
		this.currentDebit = currentDebit;
	}
	public String getCurrentCredit() {
		return currentCredit;
	}
	public void setCurrentCredit(String currentCredit) {
		this.currentCredit = currentCredit;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}
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
		return "Master [accountCode=" + accountCode + ", accountHead="
				+ accountHead + ", currentDebit=" + currentDebit
				+ ", currentCredit=" + currentCredit + ", schedule=" + schedule
				+ ", balance=" + balance + ", openingBalance=" + openingBalance
				+ "]";
	}
}
