package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.FixedDeposit;
import com.mindgate.main.exception.FixedDepositNotAddedException;
import com.mindgate.main.repository.FixedDepositRepositoryInterface;

public class FixedDepositService implements FixedDepositServiceInterface {
	@Autowired
	public FixedDepositRepositoryInterface fixedDepositRepository;

	@Override
	public ResponseEntity<?> addFixedDeposit(FixedDeposit fixedDeposit) {
		boolean result = fixedDepositRepository.addFixedDeposit(fixedDeposit);
		if (result)
			return new ResponseEntity<>("Fixed Deposit added", HttpStatus.OK);
		else
			throw new FixedDepositNotAddedException();

	}

	@Override
	public ResponseEntity<?> getAllFixedDeposit() {
		List<FixedDeposit> fixedDepositList = fixedDepositRepository.getAllFixedDeposit();
		return new ResponseEntity<>(fixedDepositList, HttpStatus.OK);
	}

}
