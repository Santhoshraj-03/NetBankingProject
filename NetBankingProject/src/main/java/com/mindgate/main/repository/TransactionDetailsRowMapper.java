package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.AccountDetails;
import com.mindgate.main.domain.TransactionDetails;
import com.mindgate.main.domain.UserDetails;

public class TransactionDetailsRowMapper implements RowMapper<TransactionDetails> {

	@Override
	public TransactionDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		int transactionId = rs.getInt("trans_id");
		long accountNumber = rs.getLong("acc_no");
		double transAmount = rs.getDouble("trans_amount");
		String transType = rs.getString("trans_type");
		long receiverAccNo = rs.getLong("receiver_acc_no");
		String status = rs.getString("status");
		Date transdate = rs.getDate("trans_date");
		long accountNum = rs.getLong("acc_number");
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

		AccountDetails accountDetails = new AccountDetails(accountNum, userDetails, ifscCode, balance, overdraftOpted,
				overdraftBalnce, overdraftCharges, accountType);

		TransactionDetails transactionDetails = new TransactionDetails(transactionId, accountDetails, transAmount,
				transType, accountDetails, status, transdate);

		return transactionDetails;
	}

}
