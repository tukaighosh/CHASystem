package com.krishna.chasystem.web.dto;


public class YearEntryMaster {

	private int yearCode;
	private int beginYear;
	private int endYear;
	public int getYearCode() {
		return yearCode;
	}
	public void setYearCode(int yearCode) {
		this.yearCode = yearCode;
	}
	public int getBeginYear() {
		return beginYear;
	}
	public void setBeginYear(int beginYear) {
		this.beginYear = beginYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	@Override
	public String toString() {
		return "YearEntry [yearCode=" + yearCode + ", beginYear=" + beginYear
				+ ", endYear=" + endYear + "]";
	}
}
