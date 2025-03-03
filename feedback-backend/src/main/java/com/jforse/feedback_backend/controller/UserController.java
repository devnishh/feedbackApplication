package com.jforse.feedback_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jforse.feedback_backend.dto.UserDTO;
import com.jforse.feedback_backend.service.UserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

	private UserService service;

	// build add user rest api

	
	//incoming post request to this method
	//@RequestBody extract the josn from client and convert into java Object dto
	@PostMapping
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO dto) {

		UserDTO saveUser = service.createUser(dto);

		return new ResponseEntity<>(saveUser, HttpStatus.CREATED);
	}
}
