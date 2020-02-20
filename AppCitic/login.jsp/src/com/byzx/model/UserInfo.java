package com.byzx.model;

public class UserInfo {
private Integer userId;
	
	private String userName;
	
	private String password;

	public UserInfo() {}
	//构造无参

	public UserInfo(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}

	
	
	public Integer getUserId() {
		return userId;
	}

	public UserInfo(Integer userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public void setUserId(Integer userId) {
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
	
}
