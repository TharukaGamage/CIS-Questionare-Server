package com.tharuka.spring.user;

//Base response for for all responses
//Created by Tharuka Gamage on 20/11/20.
//Copyright © 2020 Tharuka Gamage. All rights reserved.

public class BaseResponse {
	
	protected String message;
	protected Boolean success;
	

	public BaseResponse(String message2, boolean success2) {
		this.message = message2;
		this.success = success2;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	

}
