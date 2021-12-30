package com.spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.project.entity.User;
import com.spring.project.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService service;
	

	@GetMapping("/main")
	public String getIndex() {
		
		return "Index";
	}
	
	@GetMapping("/register")
	public String getRegisterPage() {
		return "Register";
	}
	
	@PostMapping("/process_register")
	public String registerUser(User user) {
		BCryptPasswordEncoder psencode = new BCryptPasswordEncoder();
		String encodedPassword = psencode.encode(user.getPassword());
		user.setPassword(encodedPassword);
		service.saveUser(user);
		
		return "Index";
	}
	
	@GetMapping("/users")
	public String getHomePage() {
		
		return "Home";
	}
	
	@GetMapping("/process_person")
	public String getSavePerson() {
		
		return "Person";
	}
	
	@GetMapping("/logout-success")
	public String logout() {
		return "Index";
	}
	
}
