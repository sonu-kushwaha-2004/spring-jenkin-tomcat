package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public  String homePage() {
		return "<html><head><title>Home</title></head><body><h2>Welcome to spring boot project !!</h2></body></html>";
	}
}
