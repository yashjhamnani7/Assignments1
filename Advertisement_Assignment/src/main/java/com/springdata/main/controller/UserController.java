package com.springdata.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.main.json.User;
import com.springdata.main.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService registrationService;
	@RequestMapping(value="/register",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE ,consumes=MediaType.APPLICATION_JSON_VALUE)
	public User registerUser(@RequestBody User user) {
		return registrationService.save(user);
	}
	@GetMapping(value="/getuser",produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@RequestHeader(name="auth-token") String authToken) {
			return registrationService.getCurrentUserDetails(authToken);
	}
	
	@PostMapping(value="/login",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String loginUser(@RequestBody User user){
		return registrationService.Login(user);
	}
	
	@DeleteMapping(value="/logout",produces=MediaType.APPLICATION_JSON_VALUE)
	public String logoutUser(@RequestHeader(name="auth-token") String authToken) {
		return registrationService.Logout(authToken);
	}
}
