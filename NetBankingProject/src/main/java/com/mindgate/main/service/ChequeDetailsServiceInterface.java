package com.mindgate.main.service;

import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.ChequeDetails;

public interface ChequeDetailsServiceInterface {

	public ResponseEntity<?> addChequeDeposit(ChequeDetails chequeDeposit);

	public ResponseEntity<?> getAllChequeDeposits();
}
