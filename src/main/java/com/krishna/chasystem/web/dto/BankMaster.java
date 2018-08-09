package com.krishna.chasystem.web.dto;

import com.krishna.chasystem.web.constants.CheckPrintFormatEnum;

public class BankMaster {

	private long bankCode;
	private String bankName;
	private String accountCode;
	private CheckPrintFormatEnum checkPrintFormat;
	private String transactionCode;
	
	public long getBankCode() {
		return bankCode;
	}
	public void setBankCode(long bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public CheckPrintFormatEnum getCheckPrintFormat() {
		return checkPrintFormat;
	}
	public void setCheckPrintFormat(CheckPrintFormatEnum checkPrintFormat) {
		this.checkPrintFormat = checkPrintFormat;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	@Override
	public String toString() {
		return "BankMaster [bankCode=" + bankCode + ", bankName=" + bankName
				+ ", accountCode=" + accountCode + ", checkPrintFormat="
				+ checkPrintFormat + ", transactionCode=" + transactionCode
				+ "]";
	}
}
