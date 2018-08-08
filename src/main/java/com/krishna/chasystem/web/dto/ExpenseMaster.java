package com.krishna.chasystem.web.dto;

import org.springframework.stereotype.Component;

@Component
public class ExpenseMaster {

	private int expenseCode;
	private String expenseName;
	private String accountCode;
	private int cgst;
	private int sgst;
	private int igst;
	private String receiptOrDetailAction;
	
	public int getExpenseCode() {
		return expenseCode;
	}
	public void setExpenseCode(int expenseCode) {
		this.expenseCode = expenseCode;
	}
	public String getExpenseName() {
		return expenseName;
	}
	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public int getCgst() {
		return cgst;
	}
	public void setCgst(int cgst) {
		this.cgst = cgst;
	}
	public int getSgst() {
		return sgst;
	}
	public void setSgst(int sgst) {
		this.sgst = sgst;
	}
	public int getIgst() {
		return igst;
	}
	public void setIgst(int igst) {
		this.igst = igst;
	}
	public String getReceiptOrDetailAction() {
		return receiptOrDetailAction;
	}
	public void setReceiptOrDetailAction(String receiptOrDetailAction) {
		this.receiptOrDetailAction = receiptOrDetailAction;
	}
	@Override
	public String toString() {
		return "Expensemaster [expenseCode=" + expenseCode + ", expenseName="
				+ expenseName + ", accountCode=" + accountCode + ", cgst="
				+ cgst + ", sgst=" + sgst + ", igst=" + igst
				+ ", receiptOrDetailAction=" + receiptOrDetailAction + "]";
	}
}
