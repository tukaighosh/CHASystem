package com.krishna.chasystem.web.dto;

public class UnitMaster {

	private int unitId;
	private String unitName;
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	@Override
	public String toString() {
		return "UnitMaster [unitId=" + unitId + ", unitName=" + unitName + "]";
	}
}
