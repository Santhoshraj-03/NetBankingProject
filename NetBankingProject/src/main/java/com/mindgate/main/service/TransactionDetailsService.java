package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.TransactionDetails;
import com.mindgate.main.exception.TransactionNotAddedException;
import com.mindgate.main.repository.TransactionDetailsRepository;

public class TransactionDetailsService implements TransactionDetailsServiceInterface {

	@Autowired
	private TransactionDetailsRepository transactionDetailsRepository;

	@Override
	public ResponseEntity<?> addTransactionDetails(TransactionDetails transactionDetails) {
		boolean result = transactionDetailsRepository.addTransactionDetails(transactionDetails);
		if (result)
			return new ResponseEntity<>("transaction added", HttpStatus.OK);
		else
			throw new TransactionNotAddedException();
	}

	@Override
	public ResponseEntity<?> getAllTransaction() {
		List<TransactionDetails> transactionDetailsList = transactionDetailsRepository.getAllTransaction();
		return new ResponseEntity<>(transactionDetailsList, HttpStatus.OK);
	}

}
