package com.krishna.chasystem.web.dto;


public class UserMaster {

	private String userName;
	private String password;
	private String role;
	
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
		return "UserMaster [userName=" + userName + ", password=" + password
				+ ", role=" + role + "]";
	}
}
