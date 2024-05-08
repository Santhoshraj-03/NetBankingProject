package com.mindgate.main.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FixedDeposit {

	private int fdId;
	private UserDetails userDetails;
	private double fdAmount;
	private double roi;
	private Date dateCreate;
	private Date matureDate;
	private double tenure;
	private double matureAmount;

}
