package com.krishna.chasystem.web.dto;

public class StateMaster {

	private long stateCode;
	private String stateName;
	private String gstNumber;
	public long getStateCode() {
		return stateCode;
	}
	public void setStateCode(long stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	@Override
	public String toString() {
		return "StateMaster [stateCode=" + stateCode + ", stateName=" + stateName + ", gstNumber=" + gstNumber + "]";
	}
}
