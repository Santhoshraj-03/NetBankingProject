package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FixedDeposit {

	private int fdId;
	private UserDetails userDetails;
	private double fdAmount;
	private double roi;
	private Date dateCreate;
	private Date matureDate;
	private double tenure;
	private double matureAmount;

	public FixedDeposit() {
		// TODO Auto-generated constructor stub
	}

	public FixedDeposit(int fdId, UserDetails userDetails, double fdAmount, double roi, Date dateCreate,
			Date matureDate, double tenure, double matureAmount) {
		super();
		this.fdId = fdId;
		this.userDetails = userDetails;
		this.fdAmount = fdAmount;
		this.roi = roi;
		this.dateCreate = dateCreate;
		this.matureDate = matureDate;
		this.tenure = tenure;
		this.matureAmount = matureAmount;
	}

	public int getFdId() {
		return fdId;
	}

	public void setFdId(int fdId) {
		this.fdId = fdId;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public double getFdAmount() {
		return fdAmount;
	}

	public void setFdAmount(double fdAmount) {
		this.fdAmount = fdAmount;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Date getMatureDate() {
		return matureDate;
	}

	public void setMatureDate(Date matureDate) {
		this.matureDate = matureDate;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public double getMatureAmount() {
		return matureAmount;
	}

	public void setMatureAmount(double matureAmount) {
		this.matureAmount = matureAmount;
	}

	@Override
	public String toString() {
		return "FixedDeposit [fdId=" + fdId + ", userDetails=" + userDetails + ", fdAmount=" + fdAmount + ", roi=" + roi
				+ ", dateCreate=" + dateCreate + ", matureDate=" + matureDate + ", tenure=" + tenure + ", matureAmount="
				+ matureAmount + "]";
	}

}
