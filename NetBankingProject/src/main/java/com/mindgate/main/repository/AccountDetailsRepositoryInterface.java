package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.AccountDetails;

public interface AccountDetailsRepositoryInterface {

	public boolean addAccountDetails(AccountDetails accountDetails);

	public List<AccountDetails> getAllAccountDetails();

	public AccountDetails getAccountDetailsByAccNumber(long accountNumber);

}
