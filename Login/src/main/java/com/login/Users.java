package com.login;

public class Users {
	private int id;
	private String username;
	private String password;
	private String email;
	private String mobile;
	public Users(int id, String username, String password, String email, String mobile) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	public Users(String username, String password, String email, String mobile) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
