package com.mindgate.main.service;

import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.UserDetails;

public interface UserDetailsServiceInterface {

	public ResponseEntity<?> addUserDetails(UserDetails userDetails);
	
}
