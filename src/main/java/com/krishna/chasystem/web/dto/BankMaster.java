package com.krishna.chasystem.web.dto;

public class BankMaster {

	private int bankCode;
	private String bankName;
	private String accountCode;
	private int checkPrintFormatId;
	private String transactionCode;
	
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
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
	
	public int getCheckPrintFormatId() {
		return checkPrintFormatId;
	}
	public void setCheckPrintFormatId(int checkPrintFormatId) {
		this.checkPrintFormatId = checkPrintFormatId;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	@Override
	public String toString() {
		return "BankMaster [bankCode=" + bankCode + ", bankName=" + bankName + ", accountCode=" + accountCode
				+ ", checkPrintFormatId=" + checkPrintFormatId + ", transactionCode=" + transactionCode + "]";
	}
}
