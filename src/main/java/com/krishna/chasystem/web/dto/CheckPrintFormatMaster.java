package com.krishna.chasystem.web.dto;

public class CheckPrintFormatMaster {
	
	private long printFormatId;
	private long printFormatName;
	private double printHeight;
	private double printWidth;
	
	public long getPrintFormatId() {
		return printFormatId;
	}
	public void setPrintFormatId(long printFormatId) {
		this.printFormatId = printFormatId;
	}
	public long getPrintFormatName() {
		return printFormatName;
	}
	public void setPrintFormatName(long printFormatName) {
		this.printFormatName = printFormatName;
	}
	public double getPrintHeight() {
		return printHeight;
	}
	public void setPrintHeight(double printHeight) {
		this.printHeight = printHeight;
	}
	public double getPrintWidth() {
		return printWidth;
	}
	public void setPrintWidth(double printWidth) {
		this.printWidth = printWidth;
	}
	@Override
	public String toString() {
		return "PrintFormatMaster [printFormatId=" + printFormatId + ", printFormatName=" + printFormatName
				+ ", printHeight=" + printHeight + ", printWidth=" + printWidth + "]";
	}
}
