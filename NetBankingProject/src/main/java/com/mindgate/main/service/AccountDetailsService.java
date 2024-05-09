package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.AccountDetails;
import com.mindgate.main.exception.AccountNotAddedException;
import com.mindgate.main.exception.AccountNotFoundException;
import com.mindgate.main.repository.AccountDetailsRepositoryInterface;

public class AccountDetailsService implements AccountDetailsServiceInterface {

	@Autowired
	private AccountDetailsRepositoryInterface accountDetailsRepository;

	@Override
	public ResponseEntity<?> addAccountDetails(AccountDetails accountDetails) {
		boolean result = accountDetailsRepository.addAccountDetails(accountDetails);
		if (result)
			return new ResponseEntity<String>("Account added", HttpStatus.OK);
		else
			throw new AccountNotAddedException();
	}

	@Override
	public ResponseEntity<?> getAllAccountDetails() {
		List<AccountDetails> accountDetailsList = accountDetailsRepository.getAllAccountDetails();
		return new ResponseEntity<List<AccountDetails>>(accountDetailsList, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getAccountDetailsByAccNumber(long accountNumber) {
		AccountDetails accountDetails = accountDetailsRepository.getAccountDetailsByAccNumber(accountNumber);
		if (accountDetails != null)
			return new ResponseEntity<AccountDetails>(accountDetails, HttpStatus.OK);
		else
			throw new AccountNotFoundException();
	}

}
