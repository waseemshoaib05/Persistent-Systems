package com.dailycodebuffer.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.springbootdemo.model.User;

@RestController

public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}
	//@RequestMapping(value="/user", method = RequestMethod.GET)
	//@GetMapping("/user")
	@PostMapping("/user")
	public User user() {
		User user=new User();
		user.setId("1");
		user.setName("Waseem");
		user.setEmail("waseem.shoaib05@gmail.com");
		
		return user;
		
		
	}
	@GetMapping("/{id}/{id2}")
	public String pathVariable(@PathVariable String id, @PathVariable("id2") String name ) {
		return "The path variables are : "+ id+ " and "+name;
	}
	
	@GetMapping("/requestParam")
	public String requestParam(@RequestParam String name, @RequestParam(name="email", required = false, defaultValue = "") String emailid) {
		return "Your name is : "+name+" and EmailId : "+emailid;
	}

}
