package com.ncit.minor.futsalbookingapp.controller;

import com.ncit.minor.futsalbookingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	UserService userService;

	@GetMapping("/")

	public String index(Model model) {
		return "index";
	}

	@GetMapping("/login")
	public String login() {

		return "signin";
	}
}
