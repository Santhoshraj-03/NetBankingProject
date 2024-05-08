package com.mindgate.main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDetails {
	private int accNumber;
	private UserDetails userDetails;
	private String ifscCode;
	private double balance;
	private String odOpted;
	private double odBalance;
	private double odCharges;
	private String accType;

}