package com.tharuka.spring.user;

//auth response model for user authentication

//Created by Tharuka Gamage on 20/11/20.
//Copyright © 2020 Tharuka Gamage. All rights reserved.

public class AuthResponse extends BaseResponse {

	String token = "device_token_001_id_2546";
	
	

	public AuthResponse(String message, boolean success, String token2) {
		super(message, success);
		this.token = token2;
	}


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
