package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mindgate.main.domain.AccountDetails;

@Component
public class AccountDetailsRepository implements AccountDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String ADD_ACCOUNT_DETAILS = "INSERT INTO account_details VALUES(?,?,?)";
	private static final String GET_ACCOUNT_DETAILS = "SELECT*FROM account_details";
	private static final String GET_ONE_ACCOUNTNUMBER = "SELECT * FROM account_details WHERE acc_number=?";

	@Override
	public boolean addAccountDetails(AccountDetails accountDetails) {
		Object[] parameters = { accountDetails.getUserDetails(), accountDetails.getIfscCode(),
				accountDetails.getAccType() };
		int resultCount = jdbcTemplate.update(ADD_ACCOUNT_DETAILS, parameters);
		if (resultCount > 0) {
			return true;
		}

		return false;
	}

	@Override
	public List<AccountDetails> getAllAccountDetails() {
		List<AccountDetails> getAccountdetails = jdbcTemplate.query(GET_ACCOUNT_DETAILS, new AccountDetailsRowMapper());
		return getAccountdetails;
	}

	@Override
	public AccountDetails getAccountDetailsByAccNumber(long accountNumber) {
		AccountDetails accountDetails = jdbcTemplate.queryForObject(GET_ONE_ACCOUNTNUMBER,
				new AccountDetailsRowMapper(), accountNumber);
		return accountDetails;
	}

}
