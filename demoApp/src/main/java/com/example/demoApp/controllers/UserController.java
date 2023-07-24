package com.example.demoApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoApp.entities.User;
import com.example.demoApp.services.UserService;
import com.example.demoApp.utilities.ApiResp;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
//-------------------------------------------------------------

//http://localhost:8085/api/user/
	@PostMapping(value="/")
	public User createUser(@RequestBody User user) {
		
		User createdUser=this.userService.createUser(user);
		
		return createdUser;
	
	}
	
//http://localhost:8085/api/user/updateUser/1	
    @PutMapping("/updateUser/{userId}")
	public User updateUser(@RequestBody User user,@PathVariable Long userId) {
	
    User updatedUser = this.userService.updateUser(user, userId);
	
    return updatedUser;
	}
    
    
//http://localhost:8085/api/user/getUser/1		
    @GetMapping("/getUser/{userIddd}")
	public ResponseEntity<User> findUser(@PathVariable ("userIddd") Long userId) {

		User user = this.userService.findUser(userId);
		
		return new ResponseEntity<>(user,HttpStatus.OK);
		
	}
	
 //http://localhost:8085/api/user/getAllUsers
    @GetMapping("/getAllUsers")
	public List<User> findAllUsers() {
	
		List<User> allUsers = this.userService.findAllUsers();
		
		return allUsers;
	}
	
    
//http://localhost:8085/api/user/deleteUser/1
    @DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<ApiResp> deleteUser(@PathVariable Long userId) {
    	
		 this.userService.deleteUser(userId);

		 return new ResponseEntity<ApiResp>(new ApiResp("user deleted successfully...",true),HttpStatus.OK);

		 
	}
    
	
}
