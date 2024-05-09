package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.TransactionDetails;

public interface TransactionDetailsRespositoryInterface {

	public boolean addTransactionDetails(TransactionDetails transactionDetails);

	public List<TransactionDetails> getAllTransaction();
}
