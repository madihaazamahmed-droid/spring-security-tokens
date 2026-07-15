package com.security_token.spring_security_tokens.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class Home {
	
	@GetMapping("/csrf-token")
	public CsrfToken getToken(HttpServletRequest req) {
		return (CsrfToken)req.getAttribute("_csrf");
		
	}
	
	@GetMapping("/view")
	public String home() {
		return "account balance";
		
	}

	@PostMapping("/withdraw")
	public String insert() {
		return "Rs.1";
	}

}
