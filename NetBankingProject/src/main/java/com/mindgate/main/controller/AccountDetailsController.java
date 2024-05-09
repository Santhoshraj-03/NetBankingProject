package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.AccountDetails;
import com.mindgate.main.service.AccountDetailsServiceInterface;

@RestController
public class AccountDetailsController {

	@Autowired
	private AccountDetailsServiceInterface accountDetailsService;

	@PostMapping("add-account")
	public ResponseEntity<?> addAccountDetails(AccountDetails accountDetails) {
		return accountDetailsService.addAccountDetails(accountDetails);
	}

	@GetMapping("get-all-account")
	public ResponseEntity<?> getAllAccountDetails() {
		return accountDetailsService.getAllAccountDetails();
	}

	@GetMapping("get-account/{accountNumber}")
	public ResponseEntity<?> getAccountDetailsByAccNumber(@PathVariable long accountNumber) {
		return accountDetailsService.getAccountDetailsByAccNumber(accountNumber);
	}
}
