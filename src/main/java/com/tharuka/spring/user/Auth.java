package com.tharuka.spring.user;

import javax.persistence.Entity;
import javax.persistence.Id;

//main model for user authentication

//Created by Tharuka Gamage on 20/11/20.
//Copyright © 2020 Tharuka Gamage. All rights reserved.

@Entity
public class Auth {
	
	@Id
	private String userName;
	private String password;
	private String token;
	
	
	public String getUserName() {
		return userName;
	}
	
	
	public Auth() {
	}
	
	
	public Auth(String userName, String password, String token) {
		super();
		this.userName = userName;
		this.password = password;
		this.token = token;
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
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
