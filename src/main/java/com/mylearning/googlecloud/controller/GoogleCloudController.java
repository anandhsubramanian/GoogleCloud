package com.mylearning.googlecloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleCloudController {

	@GetMapping("/getMessage")
	public String getResponseMessage() {
		return "This is Google Cloud";
	}
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to Google Cloud";
	}
}
