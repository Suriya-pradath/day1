package com.example.portal.day1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Day1 {
	
@GetMapping("/welcome")
public String Welcome(){
		return "we";
	}

}
