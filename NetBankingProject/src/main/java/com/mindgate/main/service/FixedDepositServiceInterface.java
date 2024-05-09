package com.mindgate.main.service;

import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.FixedDeposit;

public interface FixedDepositServiceInterface {

	public ResponseEntity<?> addFixedDeposit(FixedDeposit fixedDeposit);

	public ResponseEntity<?> getAllFixedDeposit();

}
