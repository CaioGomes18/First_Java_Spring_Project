package com.devcaio.userdepart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcaio.userdepart.domain.User;
import com.devcaio.userdepart.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping
	public List<User>findAll(){
		
		List<User> resultado = userRepo.findAll();
		return resultado;
		
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id){
		
		User user = userRepo.findById(id).get();
		return user;
		
	}
	
	@PostMapping
	public User findById(@RequestBody User user){
		
		User resultado = userRepo.save(user);
		return resultado;
		
	}
}
