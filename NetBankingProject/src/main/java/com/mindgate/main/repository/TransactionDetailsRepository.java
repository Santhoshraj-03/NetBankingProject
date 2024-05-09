package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mindgate.main.domain.TransactionDetails;

public class TransactionDetailsRepository implements TransactionDetailsRespositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String ADD_TRANSACTION = "INSERT INTO TRANSACTION_DETAILS (ACC_NO,TRANS_AMOUNT,TRANS_TYPE,RECEIVER_ACC_NO,STATUS,TRANS_DATE) VALUES (?,?,?,?,?,?)";
	private static final String GET_ALL_TRANSACTION_DETAILS = "SELECT * FROM TRANSACTION_DETAILS";

	@Override
	public boolean addTransactionDetails(TransactionDetails transactionDetails) {
		Object[] parameters = { transactionDetails.getAccNo().getAccNumber(), transactionDetails.getTransAmount(),
				transactionDetails.getTransType(), transactionDetails.getReceiverAccNo().getAccNumber(),
				transactionDetails.getStatus(), transactionDetails.getTransDate() };
		int result = jdbcTemplate.update(ADD_TRANSACTION, parameters);
		if (result > 0)
			return true;
		return false;
	}

	@Override
	public List<TransactionDetails> getAllTransaction() {
		List<TransactionDetails> transactionDetailsList = jdbcTemplate.query(GET_ALL_TRANSACTION_DETAILS,
				new TransactionDetailsRowMapper());
		return transactionDetailsList;
	}

}
