package com.krishna.chasystem.web.dto;


public class ExpenseMaster {

	private int expenseCode;
	private String expenseName;
	private String accountCode;
	private double cgst;
	private double sgst;
	private double igst;
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
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getIgst() {
		return igst;
	}
	public void setIgst(double igst) {
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
		return "ExpenseMaster [expenseCode=" + expenseCode + ", expenseName=" + expenseName + ", accountCode="
				+ accountCode + ", cgst=" + cgst + ", sgst=" + sgst + ", igst=" + igst + ", receiptOrDetailAction="
				+ receiptOrDetailAction + "]";
	}
}
