package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

public class TransactionDetails {

	private int transId;
	private AccountDetails accNo;
	private double transAmount;
	private String transType;
	private AccountDetails receiverAccNo;
	private String status;
	private Date transDate;

	public TransactionDetails() {
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(int transId, AccountDetails accNo, double transAmount, String transType,
			AccountDetails receiverAccNo, String status, Date transDate) {
		super();
		this.transId = transId;
		this.accNo = accNo;
		this.transAmount = transAmount;
		this.transType = transType;
		this.receiverAccNo = receiverAccNo;
		this.status = status;
		this.transDate = transDate;
	}

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public AccountDetails getAccNo() {
		return accNo;
	}

	public void setAccNo(AccountDetails accNo) {
		this.accNo = accNo;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public AccountDetails getReceiverAccNo() {
		return receiverAccNo;
	}

	public void setReceiverAccNo(AccountDetails receiverAccNo) {
		this.receiverAccNo = receiverAccNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	@Override
	public String toString() {
		return "TransactionDetails [transId=" + transId + ", accNo=" + accNo + ", transAmount=" + transAmount
				+ ", transType=" + transType + ", receiverAccNo=" + receiverAccNo + ", status=" + status
				+ ", transDate=" + transDate + "]";
	}

}
