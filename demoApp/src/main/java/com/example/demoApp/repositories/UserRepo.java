package com.example.demoApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoApp.entities.User;

public interface UserRepo extends JpaRepository<User,Long>{
	
	

}
