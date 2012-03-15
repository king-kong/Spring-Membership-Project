package com.example.authorizationTest;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	public LoginController() {}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(Map<String, Object> model){
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLoginPage(){
		return "home";
	}
	
}
