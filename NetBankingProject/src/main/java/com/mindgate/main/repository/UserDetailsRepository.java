package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.UserDetails;

@Repository
public class UserDetailsRepository implements UserDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String ADD_USER_DETAILS = "INSERT INTO USER_DETAILS (FIRST_NAME,LAST_NAME,EMAIL_ID,ADDRESS,MOBILE,DOB,GENDER,USER_NAME,PASSWORD) VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String GET_ALL_USER_DETAILS = "SELECT * FROM USER_DETAILS";
	private static final String GET_USER_DETAILS_BY_ID = "SELECT * FROM USER_DETAILS WHERE USER_ID = ?";

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

	@Override
	public List<UserDetails> getAllUserDetails() {
		List<UserDetails> userDetailsList = jdbcTemplate.query(GET_ALL_USER_DETAILS, new UserDetailsRowMapper());
		return userDetailsList;
	}

	@Override
	public UserDetails getUserDetailsByUserId(int userId) {
		UserDetails userDetails = jdbcTemplate.queryForObject(GET_USER_DETAILS_BY_ID, new UserDetailsRowMapper(),
				userId);
		if (userDetails != null)
			return userDetails;
		else
			return null;
	}
}
