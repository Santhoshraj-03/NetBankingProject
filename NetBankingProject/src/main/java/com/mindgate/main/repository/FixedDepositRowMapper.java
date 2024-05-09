package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.FixedDeposit;
import com.mindgate.main.domain.UserDetails;

public class FixedDepositRowMapper implements RowMapper<FixedDeposit> {

	@Override
	public FixedDeposit mapRow(ResultSet rs, int rowNum) throws SQLException {
		int fixedId = rs.getInt("fd_id");
		int userId = rs.getInt("user_id");
		double fixedAmount = rs.getDouble("fd_amount");
		double roi = rs.getDouble("roi");
		Date dateCreated = rs.getDate("date_created");
		Date mature_date = rs.getDate("mature_date");
		int tenure = rs.getInt("tenure");
		Date matureAmount = rs.getDate("mature_amount");
		int userid = rs.getInt("user_id");
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
		UserDetails userDetails = new UserDetails(userid, firstName, lastName, emailId, address, mobile, date, gender,
				userType, userName, password, loginAccount, accountStatus);

		FixedDeposit fixedDeposit = new FixedDeposit(fixedId, userDetails, fixedAmount, roi, dateCreated, matureAmount,
				tenure, loginAccount);

		return fixedDeposit;
	}

}
