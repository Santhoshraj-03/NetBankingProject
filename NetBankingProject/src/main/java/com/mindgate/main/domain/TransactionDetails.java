package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionDetails {

	private int transId;
	private AccountDetails accNo;
	private double transAmount;
	private String transType;
	private AccountDetails receiverAccNo;
	private String status;
	private Date transDate;
}
