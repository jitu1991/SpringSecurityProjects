package com.javabrains.springsecurityldap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String index() {
		return "<h1>Home Page</h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome user</h1>";
	}

	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome Admin</h1>";
	}

}
