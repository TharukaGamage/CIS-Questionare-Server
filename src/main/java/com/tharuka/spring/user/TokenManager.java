package com.tharuka.spring.user;

import java.util.UUID;

//unique token generator

//Created by Tharuka Gamage on 20/11/20.
//Copyright © 2020 Tharuka Gamage. All rights reserved.

public class TokenManager {

public String getToken() {
	
	return "Bearer"+UUID.randomUUID().toString().replace("-", "");
}
	
}
