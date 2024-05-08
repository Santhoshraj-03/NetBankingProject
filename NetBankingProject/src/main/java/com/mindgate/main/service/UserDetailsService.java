package com.mindgate.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.UserDetails;
import com.mindgate.main.exception.UserNotAddedException;
import com.mindgate.main.repository.UserDetailsRepositoryInterface;

@Service
public class UserDetailsService implements UserDetailsServiceInterface {

	@Autowired
	private UserDetailsRepositoryInterface userDetailsRepository;

	@Override
	public ResponseEntity<?> addUserDetails(UserDetails userDetails) {
		boolean result = userDetailsRepository.addUserDetails(userDetails);
		if (result)
			return new ResponseEntity<String>("Used added", HttpStatus.OK);
		else
			throw new UserNotAddedException();
	}

}
