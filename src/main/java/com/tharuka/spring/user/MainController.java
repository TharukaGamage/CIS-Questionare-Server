package com.tharuka.spring.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//main controller
//Created by Tharuka Gamage on 20/11/20.
//Copyright © 2020 Tharuka Gamage. All rights reserved.

@RestController
public class MainController {

//	init mainService
	@Autowired
	private MainService authService;
	

//	sign up route
	@RequestMapping(method = RequestMethod.POST, value = "/sign-up")
	private AuthResponse signUp(@RequestBody Auth auth) {
		
		return authService.signUp(auth);
	}
	
//	login route
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	private AuthResponse logIn(@RequestBody LoginRequest loginRequest) {	
		return authService.login(loginRequest);
	}
	
//	save answers route
	@RequestMapping(method = RequestMethod.POST, value = "/save-answers")
	private BaseResponse logIn(@RequestBody QuertionareAnswers answers) {	
		return authService.saveAnswers(answers);
	}
	
//	get all answers route
	@RequestMapping(method = RequestMethod.POST, value = "/get-answers")
	private List<QuertionareAnswers> getAnswers(@RequestBody String token) {
		System.out.println("got req");
		return authService.getAnswers();
	}
}
