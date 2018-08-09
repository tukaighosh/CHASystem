package com.krishna.chasystem.web.dto;


public class UserMaster {

	private long userId;
	private String userName;
	private String password;
	private String role;
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserMaster [userId=" + userId + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ "]";
	}
}
