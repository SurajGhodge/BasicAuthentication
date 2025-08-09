package com.sbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbs.UserService;
import com.sbs.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
private UserService userService;
	@GetMapping("/getall")
	public List<User>getAllUsers()
	{
		return userService.getAllUser();
	}
	@GetMapping("/getuser/{username}")
	public User getUser(@PathVariable("username") String username)
	{
		return userService.getUser(username);
	}
	@PostMapping("/add")
	public User add(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	

}
