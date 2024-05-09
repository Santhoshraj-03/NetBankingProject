package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.AccountDetails;
import com.mindgate.main.domain.UserDetails;

public class AccountDetailsRowMapper implements RowMapper<AccountDetails> {

	@Override
	public AccountDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		long accountNumber = rs.getLong("acc_number");
		int userId = rs.getInt("user_id");
		String ifscCode = rs.getString("ifsc_code");
		double balance = rs.getDouble("balance");
		String overdraftOpted = rs.getString("od_opted");
		double overdraftBalnce = rs.getDouble("od_balance");
		double overdraftCharges = rs.getDouble("od_charges");
		String accountType = rs.getString("acc_type");
		int userid = rs.getInt("user_id");
		String firstName = rs.getString("first_name");
		String lastName = rs.getString("last_name");
		String emailId = rs.getString("email_id");
		String address = rs.getString("address");
		Date date = rs.getDate("dob");
		String gender = rs.getString("gender");
		String userType = rs.getString("gender");
		String userName = rs.getString("user_name");
		String password = rs.getString("password");
		int loginAccount = rs.getInt("login_count");
		String accountStatus = rs.getString("acc_status");
		UserDetails userDetails = new UserDetails(userId, firstName, lastName, emailId, address, userid, date, gender,
				userType, userName, password, loginAccount, accountStatus);

		AccountDetails accountDetails = new AccountDetails(accountNumber, userDetails, ifscCode, balance,
				overdraftOpted, balance, overdraftCharges, accountType);
		return accountDetails;

	}

}
