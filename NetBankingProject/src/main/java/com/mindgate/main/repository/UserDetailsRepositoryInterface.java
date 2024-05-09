package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.UserDetails;

public interface UserDetailsRepositoryInterface {

	public boolean addUserDetails(UserDetails userDetails);

	public List<UserDetails> getAllUserDetails();

	public UserDetails getUserDetailsByUserId(int userId);
}
