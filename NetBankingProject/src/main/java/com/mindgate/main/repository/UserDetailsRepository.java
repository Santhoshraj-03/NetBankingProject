package com.mindgate.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.UserDetails;

@Repository
public class UserDetailsRepository implements UserDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String ADD_USER_DETAILS = "INSERT INTO USER_DETAILS (FIRST_NAME,LAST_NAME,EMAIL_ID,ADDRESS,MOBILE,DOB,GENDER,USER_NAME,PASSWORD) VALUES(?,?,?,?,?,?,?,?,?)";

	@Override
	public boolean addUserDetails(UserDetails userDetails) {
		Object[] parameters = { userDetails.getFirstName(), userDetails.getLastName(), userDetails.getEmailId(),
				userDetails.getAddress(), userDetails.getMobile(), userDetails.getDob(), userDetails.getGender(),
				userDetails.getUserName(), userDetails.getPassword() };
		int result = jdbcTemplate.update(ADD_USER_DETAILS, parameters);
		if (result > 0)
			return true;
		return false;
	}
}
