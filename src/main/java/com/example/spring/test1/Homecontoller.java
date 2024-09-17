package com.example.spring.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontoller {

	@GetMapping("/display")
	public String diplay() {
		return "Wellcome to java";
	}
}
