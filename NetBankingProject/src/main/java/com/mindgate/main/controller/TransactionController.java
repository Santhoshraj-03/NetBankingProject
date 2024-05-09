package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.TransactionDetails;
import com.mindgate.main.service.TransactionDetailsServiceInterface;

@RestController
@RequestMapping("transaction")
public class TransactionController {

	@Autowired
	private TransactionDetailsServiceInterface transactionDetailsService;

	@PostMapping("add-transaction")
	public ResponseEntity<?> addTransactionDetails(TransactionDetails transactionDetails) {
		return transactionDetailsService.addTransactionDetails(transactionDetails);
	}

	@GetMapping("get-all-transactions")
	public ResponseEntity<?> getAllTransactions() {
		return transactionDetailsService.getAllTransaction();
	}
}
