package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.AccountDetails;
import com.mindgate.main.domain.ChequeDetails;
import com.mindgate.main.domain.UserDetails;

public class ChequeDetailsRowMapper implements RowMapper<ChequeDetails> {

	@Override
	public ChequeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {

		long chequeNo = rs.getLong("cheque_no");
		long issuerAccNo = rs.getLong("issure_acc_no");
		long receiverAccNo = rs.getLong("receiver_acc_no");
		double chequeAmount = rs.getDouble("cheque_amount");
		Date chequeDate = rs.getDate("cheque_date");
		Date clearancesDate = rs.getDate("clearance_date");
		String status = rs.getString("status");

//		Receiver Account Details
		long recAccountNumber = rs.getLong("acc_number");
		int recUserId = rs.getInt("user_id");
		String recIFSCCode = rs.getString("ifsc_code");
		double recBalance = rs.getDouble("balance");
		String recOverdraftOpted = rs.getString("od_opted");
		double recOverdraftBalnce = rs.getDouble("od_balance");
		double recOverdraftCharges = rs.getDouble("od_charges");
		String recAccountType = rs.getString("acc_type");

//		Issuer Account Details
		long issuerAccountNumber = rs.getLong("acc_number");
		int issuerUserId = rs.getInt("user_id");
		String issuerIFSCCode = rs.getString("ifsc_code");
		double issuerBalance = rs.getDouble("balance");
		String issuerOverdraftOpted = rs.getString("od_opted");
		double issuerOverdraftBalnce = rs.getDouble("od_balance");
		double issuerOverdraftCharges = rs.getDouble("od_charges");
		String issuerAccountType = rs.getString("acc_type");

//		User Details
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
		AccountDetails issuerAccountDetails = new AccountDetails(issuerAccountNumber, userDetails, issuerIFSCCode,
				issuerBalance, issuerOverdraftOpted, issuerBalance, issuerOverdraftCharges, issuerAccountType);
		AccountDetails receiverAccountDetails = new AccountDetails(recAccountNumber, userDetails, recIFSCCode,
				recBalance, recOverdraftOpted, recBalance, recOverdraftCharges, recAccountType);
		ChequeDetails chequeDetails = new ChequeDetails(chequeNo, issuerAccountDetails, receiverAccountDetails,
				chequeAmount, chequeDate, clearancesDate, status);
		return chequeDetails;
	}

}
