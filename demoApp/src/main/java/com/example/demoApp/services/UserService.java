package com.example.demoApp.services;

import java.util.List;

import com.example.demoApp.entities.User;

public interface UserService {
	
	User createUser (User user);
	User updateUser (User user,Long userId);
	User findUser (Long userId);
	List<User> findAllUsers ();
	void deleteUser (Long userId);
	

}
