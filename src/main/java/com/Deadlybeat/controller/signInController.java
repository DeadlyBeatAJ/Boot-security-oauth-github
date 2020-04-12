package com.Deadlybeat.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class signInController {

	@GetMapping("/")
	public String message(Principal principal) {
		return "Hi "+principal.getName()+" welcome to my application";
	}
}
