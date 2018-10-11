package com.cg.controller;

public class Customer {

	private String name;
	private String mobile;
	private String mail;
	private String Uname;
	private String password;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		this.Uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	public Customer() {
		super();
		this.name = name;
		this.mobile = mobile;
		this.mail = mail;
		this.Uname = Uname;
		this.password = password;
	}
	
	
	
	
	
}
