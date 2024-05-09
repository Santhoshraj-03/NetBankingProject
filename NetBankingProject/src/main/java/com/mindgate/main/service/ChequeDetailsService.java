package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mindgate.main.domain.ChequeDetails;
import com.mindgate.main.exception.ChequeqNotAddedException;
import com.mindgate.main.repository.ChequeDetailsRepositoryInterface;

public class ChequeDetailsService implements ChequeDetailsServiceInterface {

	@Autowired
	private ChequeDetailsRepositoryInterface chequeDetailsRepository;

	@Override
	public ResponseEntity<?> addChequeDeposit(ChequeDetails chequeDeposit) {
		boolean result = chequeDetailsRepository.addChequeDeposit(chequeDeposit);
		if (result)
			return new ResponseEntity<>(true, HttpStatus.OK);
		else
			throw new ChequeqNotAddedException();

	}

	@Override
	public ResponseEntity<?> getAllChequeDeposits() {
		List<ChequeDetails> chequeDetailsList = chequeDetailsRepository.getAllChequeDetails();
		return new ResponseEntity<>(chequeDetailsList, HttpStatus.OK);
	}

}
