package com.krishna.chasystem.web.dto;

import com.krishna.chasystem.web.constants.ScheduleEnum;


public class Master {

	private String accountCode;
	private String accountHead;
	private double currentDebit;
	private double currentCredit;
	private ScheduleEnum schedule;
	private double balance;
	private double openingBalance;
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
	public double getCurrentDebit() {
		return currentDebit;
	}
	public void setCurrentDebit(double currentDebit) {
		this.currentDebit = currentDebit;
	}
	public double getCurrentCredit() {
		return currentCredit;
	}
	public void setCurrentCredit(double currentCredit) {
		this.currentCredit = currentCredit;
	}
	public ScheduleEnum getSchedule() {
		return schedule;
	}
	public void setSchedule(ScheduleEnum schedule) {
		this.schedule = schedule;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
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
