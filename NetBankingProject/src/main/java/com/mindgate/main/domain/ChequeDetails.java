package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChequeDetails {

	private long chequeNo;
	private AccountDetails issuerAccNo;
	private AccountDetails receiverAccNo;
	private double chequeAmount;
	private Date chequeDate;
	private Date clearanceDate;
	private String status;
}
