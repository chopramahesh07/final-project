package com.tns.final_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "<h1>Welcome to TechNimbus Solutions<h1>";
	}
	
	@GetMapping("/about")
	public String aboutus() {
		return "<h1>TechNimbus Solutions is a fast-growing software development company specializing in cloud-based business applications.<h1>";
	}
}
