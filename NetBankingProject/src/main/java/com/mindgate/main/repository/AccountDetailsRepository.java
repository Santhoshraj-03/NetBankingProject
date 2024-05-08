package com.mindgate.main.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mindgate.main.domain.AccountDetails;

public class AccountDetailsRepository implements AccountDetailsRepositoryInterface {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String ADD_ACCOUNT_DETAILS = "INSERT INTO ACCOUNT_DETAILS (";
	
	@Override
	public boolean addAccountDetails(AccountDetails accountDetails) {
		return false;
	}

}
