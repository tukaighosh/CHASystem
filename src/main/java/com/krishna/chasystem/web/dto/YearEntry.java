package com.krishna.chasystem.web.dto;

import org.springframework.stereotype.Component;

@Component
public class YearEntry {

	//primary key
	private int yearCode;
	private String beginYear;
	private String endYear;
	public int getYearCode() {
		return yearCode;
	}
	public void setYearCode(int yearCode) {
		this.yearCode = yearCode;
	}
	public String getBeginYear() {
		return beginYear;
	}
	public void setBeginYear(String beginYear) {
		this.beginYear = beginYear;
	}
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	@Override
	public String toString() {
		return "YearEntry [yearCode=" + yearCode + ", beginYear=" + beginYear
				+ ", endYear=" + endYear + "]";
	}
}
