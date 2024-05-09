package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

public class UserDetails {

	private int userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String address;
	private long mobile;
	private Date dob;
	private String gender;
	private String userType;
	private String userName;
	private String password;
	private int loginCount;
	private String accStatus;

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public UserDetails(int userId, String firstName, String lastName, String emailId, String address, long mobile,
			Date dob, String gender, String userType, String userName, String password, int loginCount,
			String accStatus) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
		this.mobile = mobile;
		this.dob = dob;
		this.gender = gender;
		this.userType = userType;
		this.userName = userName;
		this.password = password;
		this.loginCount = loginCount;
		this.accStatus = accStatus;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", address=" + address + ", mobile=" + mobile + ", dob=" + dob + ", gender=" + gender
				+ ", userType=" + userType + ", userName=" + userName + ", password=" + password + ", loginCount="
				+ loginCount + ", accStatus=" + accStatus + "]";
	}

}
