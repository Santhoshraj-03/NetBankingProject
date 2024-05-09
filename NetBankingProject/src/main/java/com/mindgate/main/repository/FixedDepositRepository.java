package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mindgate.main.domain.FixedDeposit;

public class FixedDepositRepository implements FixedDepositRepositoryInterface {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	private static final String ADD_FIXED_DEPOSIT = "INSERT INTO fixed_deposit VALUES(?,?,?,?,?,?,?)";
	private static final String GET_ALL_FIXED_DEPOSIT = "SELECT*FROM fixed_deposit";

	@Override
	public boolean addFixedDeposit(FixedDeposit fixedDeposit) {
		Object[] parameters = { fixedDeposit.getUserDetails().getUserId(), fixedDeposit.getFdAmount(),
				fixedDeposit.getRoi(), fixedDeposit.getDateCreate(), fixedDeposit.getMatureDate(),
				fixedDeposit.getTenure(), fixedDeposit.getMatureAmount() };
		int resultCount = jdbcTemplate.update(ADD_FIXED_DEPOSIT, parameters);
		if (resultCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<FixedDeposit> getAllFixedDeposit() {
		List<FixedDeposit> getfixedDeposit = jdbcTemplate.query(GET_ALL_FIXED_DEPOSIT, new FixedDepositRowMapper());
		return getfixedDeposit;
	}

}
