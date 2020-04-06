package com.example.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String nome() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
		
	}
	
	@RequestMapping("/logout")
	public String logoutPage() {
		return "logout.jsp";
		
	}

}
