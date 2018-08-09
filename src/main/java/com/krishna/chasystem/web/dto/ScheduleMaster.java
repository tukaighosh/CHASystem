package com.krishna.chasystem.web.dto;

public class ScheduleMaster {

	private long scheduleId;
	private String scheduleName;
	
	public long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleName() {
		return scheduleName;
	}
	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}
	@Override
	public String toString() {
		return "ScheduleMaster [scheduleId=" + scheduleId + ", scheduleName=" + scheduleName + "]";
	}
}
