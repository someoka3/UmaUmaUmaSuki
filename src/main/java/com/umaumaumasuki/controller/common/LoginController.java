package com.umaumaumasuki.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	// display the login page
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	// check id and password
	@PostMapping("/login")
	public String loginAuth(@RequestParam("username") String username,
							@RequestParam("password") String password,
							Model model) {
		System.out.println(username);
		System.out.println(password);
		return "index";
	}
}
