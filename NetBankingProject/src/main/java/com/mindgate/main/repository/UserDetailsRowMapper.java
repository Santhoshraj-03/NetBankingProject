package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.UserDetails;

public class UserDetailsRowMapper implements RowMapper<UserDetails> {

	@Override
	public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int userId = rs.getInt("user_id");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		String emailId = rs.getString("email_id");
		String address = rs.getString("address");
		long mobile = rs.getLong("mobile");
		Date date = rs.getDate("dob");
		String gender = rs.getString("gender");
		String userType = rs.getString("user_type");
		String userName = rs.getString("user_name");
		String password = rs.getString("password");
		int loginAccount = rs.getInt("login_count");
		String accountStatus = rs.getString("acc_status");
		UserDetails userDetails = new UserDetails(userId, firstName, lastName, emailId, address, mobile, date, gender,
				userType, userName, password, loginAccount, accountStatus);

		return userDetails;
	}

}
