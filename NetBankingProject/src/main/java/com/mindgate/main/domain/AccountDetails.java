package com.mindgate.main.domain;

public class AccountDetails {
	private long accNumber;
	private UserDetails userDetails;
	private String ifscCode;
	private double balance;
	private String odOpted;
	private double odBalance;
	private double odCharges;
	private String accType;

	public AccountDetails() {
		// TODO Auto-generated constructor stub
	}

	public AccountDetails(long accNumber, UserDetails userDetails, String ifscCode, double balance, String odOpted,
			double odBalance, double odCharges, String accType) {
		super();
		this.accNumber = accNumber;
		this.userDetails = userDetails;
		this.ifscCode = ifscCode;
		this.balance = balance;
		this.odOpted = odOpted;
		this.odBalance = odBalance;
		this.odCharges = odCharges;
		this.accType = accType;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOdOpted() {
		return odOpted;
	}

	public void setOdOpted(String odOpted) {
		this.odOpted = odOpted;
	}

	public double getOdBalance() {
		return odBalance;
	}

	public void setOdBalance(double odBalance) {
		this.odBalance = odBalance;
	}

	public double getOdCharges() {
		return odCharges;
	}

	public void setOdCharges(double odCharges) {
		this.odCharges = odCharges;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public String toString() {
		return "AccountDetails [accNumber=" + accNumber + ", userDetails=" + userDetails + ", ifscCode=" + ifscCode
				+ ", balance=" + balance + ", odOpted=" + odOpted + ", odBalance=" + odBalance + ", odCharges="
				+ odCharges + ", accType=" + accType + "]";
	}

}