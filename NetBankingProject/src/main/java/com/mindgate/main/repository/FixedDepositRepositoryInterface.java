package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.FixedDeposit;

public interface FixedDepositRepositoryInterface {

	public boolean addFixedDeposit(FixedDeposit fixedDeposit);

	public List<FixedDeposit> getAllFixedDeposit();

}
