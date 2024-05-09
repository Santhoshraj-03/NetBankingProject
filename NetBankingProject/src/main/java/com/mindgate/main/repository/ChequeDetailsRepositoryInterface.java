package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.ChequeDetails;

public interface ChequeDetailsRepositoryInterface {

	public boolean addChequeDeposit(ChequeDetails chequeDeposit);

	public List<ChequeDetails> getAllChequeDetails();

}
