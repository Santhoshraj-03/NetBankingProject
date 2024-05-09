package com.mindgate.main.service;

import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.TransactionDetails;

public interface TransactionDetailsServiceInterface {

	public ResponseEntity<?> addTransactionDetails(TransactionDetails transactionDetails);

	public ResponseEntity<?> getAllTransaction();
}
