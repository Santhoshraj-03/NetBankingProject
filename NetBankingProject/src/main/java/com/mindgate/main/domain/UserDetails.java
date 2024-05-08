package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
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

}
