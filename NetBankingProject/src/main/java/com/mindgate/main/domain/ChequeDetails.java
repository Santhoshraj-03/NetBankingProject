package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ChequeDetails {

	private long chequeNo;
	private AccountDetails issuerAccNo;
	private AccountDetails receiverAccNo;
	private double chequeAmount;
	private Date chequeDate;
	private Date clearanceDate;
	private String status;

	public ChequeDetails() {
		// TODO Auto-generated constructor stub
	}

	public ChequeDetails(long chequeNo, AccountDetails issuerAccNo, AccountDetails receiverAccNo, double chequeAmount,
			Date chequeDate, Date clearanceDate, String status) {
		super();
		this.chequeNo = chequeNo;
		this.issuerAccNo = issuerAccNo;
		this.receiverAccNo = receiverAccNo;
		this.chequeAmount = chequeAmount;
		this.chequeDate = chequeDate;
		this.clearanceDate = clearanceDate;
		this.status = status;
	}

	public long getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(long chequeNo) {
		this.chequeNo = chequeNo;
	}

	public AccountDetails getIssuerAccNo() {
		return issuerAccNo;
	}

	public void setIssuerAccNo(AccountDetails issuerAccNo) {
		this.issuerAccNo = issuerAccNo;
	}

	public AccountDetails getReceiverAccNo() {
		return receiverAccNo;
	}

	public void setReceiverAccNo(AccountDetails receiverAccNo) {
		this.receiverAccNo = receiverAccNo;
	}

	public double getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(double chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public Date getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	public Date getClearanceDate() {
		return clearanceDate;
	}

	public void setClearanceDate(Date clearanceDate) {
		this.clearanceDate = clearanceDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ChequeDetails [chequeNo=" + chequeNo + ", issuerAccNo=" + issuerAccNo + ", receiverAccNo="
				+ receiverAccNo + ", chequeAmount=" + chequeAmount + ", chequeDate=" + chequeDate + ", clearanceDate="
				+ clearanceDate + ", status=" + status + "]";
	}

}
