package com.tharuka.spring.user;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MainService {

	
	private String token = "";
	
	List<Auth> mutableList = new ArrayList<>(Arrays.asList(
			new Auth("tharuka","gamage","ssdd")
			));
	
	List<QuertionareAnswers> listAnswers = new ArrayList<>();
	
//	handle sign up request
	public AuthResponse signUp(Auth auth) {
		
		Auth x = mutableList.stream().filter(
				cre-> auth.getUserName().equals(cre.getUserName())).findFirst().orElse(null);
	
			if(x!=null) {
				return new AuthResponse("username used", false,"");
			}else {
				mutableList.add(auth);
				token = "token"+auth.getUserName();
				return new AuthResponse("success", true,"token"+auth.getUserName());
			}
	}
	
//	handle login request
	public AuthResponse login(LoginRequest loginRequest) {
		
		Auth x = mutableList.stream().filter(
				cre-> loginRequest.getUserName().equals(cre.getUserName())).findFirst().orElse(null);
		
		Auth y = mutableList.stream().filter(
				cre-> loginRequest.getPassword().equals(cre.getPassword())).findFirst().orElse(null);
		
		
		if(x!=null&&y!=null) {
			token = "token"+loginRequest.getUserName();
			return new AuthResponse("login success", true,"token"+loginRequest.getUserName());
		}else {
			return new AuthResponse("invali credencials", false,"");
		}
		
	}
//	save new answers set
	public BaseResponse saveAnswers(QuertionareAnswers answers) {
		if(token.equals(answers.getToken())) {
			listAnswers.add(answers);
			System.out.println(answers.ageGroup);
			return new BaseResponse("answers submitted", true);
		}else {
			return new BaseResponse("authentication problem", false);
		}
	}
	
//	get all answers
	public List<QuertionareAnswers> getAnswers() {
		return listAnswers;
	}
	

}