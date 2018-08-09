package com.krishna.chasystem.web.dto;

public class BankMaster {

	private long bankCode;
	private String bankName;
	private String accountCode;
	private long checkPrintFormatId;
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
	
	public long getCheckPrintFormatId() {
		return checkPrintFormatId;
	}
	public void setCheckPrintFormatId(long checkPrintFormatId) {
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
