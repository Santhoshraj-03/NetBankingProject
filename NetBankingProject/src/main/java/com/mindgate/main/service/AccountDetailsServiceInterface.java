package com.mindgate.main.service;

import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.AccountDetails;

public interface AccountDetailsServiceInterface {

	public ResponseEntity<?> addAccountDetails(AccountDetails accountDetails);

	public ResponseEntity<?> getAllAccountDetails();

	public ResponseEntity<?> getAccountDetailsByAccNumber(long accountNumber);

}
