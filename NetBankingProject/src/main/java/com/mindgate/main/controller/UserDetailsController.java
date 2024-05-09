package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.UserDetails;
import com.mindgate.main.service.UserDetailsServiceInterface;

@RestController
@RequestMapping("user-details")
public class UserDetailsController {

	@Autowired
	private UserDetailsServiceInterface userDetailsService;

	@PostMapping("add-user-details")
	public ResponseEntity<?> addUserDetails(@RequestBody UserDetails userDetails) {
		return userDetailsService.addUserDetails(userDetails);
	}

	@GetMapping("get-all-user")
	public ResponseEntity<?> getAllUserDetails() {
		return userDetailsService.getAllUserDetails();
	}

	@GetMapping("get-user/{userId}")
	public ResponseEntity<?> getUserDetailsByUserId(@PathVariable int userId) {
		return userDetailsService.getUserDetailsByUserId(userId);
	}
}
