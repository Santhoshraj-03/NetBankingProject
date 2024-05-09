package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mindgate.main.domain.ChequeDetails;

public abstract class ChequeDetailsRepository implements ChequeDetailsRepositoryInterface {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	private static final String ADD_CHEQUE_DEPOSIT = "INSERT INTO cheque_deposit VALUES(?,?,?,?,?)";
	private static final String GET_CHEQUE_DEPOSIT = "SELECT*FROM cheque_deposit";

	@Override
	public boolean addChequeDeposit(ChequeDetails chequeDetails) {
		Object[] parameters = { chequeDetails.getIssuerAccNo().getAccNumber(),
				chequeDetails.getReceiverAccNo().getAccNumber(), chequeDetails.getChequeAmount(),
				chequeDetails.getChequeDate(), chequeDetails.getClearanceDate(), chequeDetails.getStatus() };
		int resultCount = jdbcTemplate.update(ADD_CHEQUE_DEPOSIT, parameters);
		if (resultCount > 0) {
			return true;
		}

		return false;
	}

	@Override
	public List<ChequeDetails> getAllChequeDetails() {
		List<ChequeDetails> getchequeDeposit = jdbcTemplate.query(GET_CHEQUE_DEPOSIT, new ChequeDetailsRowMapper());

		return getchequeDeposit;
	}

}
