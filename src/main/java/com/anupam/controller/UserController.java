package com.anupam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anupam.model.User;
import com.anupam.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "View a list of user", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	public List<User> listUser() {
		return userService.findAll();
	}

	@ApiOperation(value = "Search a user with an ID", response = User.class)
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<User> getOne(@PathVariable(value = "id") Long id) {
		return userService.findById(id);
	}

	@ApiOperation(value = "Add a new user")
	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json")
	public User saveUser(@RequestBody User user) {
		return userService.save(user);
	}

	@ApiOperation(value = "Just Say Hello to User")
	@RequestMapping(value = "/greetings/{username}", method = RequestMethod.GET, produces = "application/json")
	public String getUser(@PathVariable(value = "username") String username) {
		return "Hello " + username.toUpperCase() + " Welcome!!";
	}

}
