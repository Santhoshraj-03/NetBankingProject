package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.FixedDeposit;
import com.mindgate.main.service.FixedDepositServiceInterface;

@RestController
@RequestMapping("fd")
public class FixedDepositController {

	@Autowired
	private FixedDepositServiceInterface fixedDepositService;

	@PostMapping("add-fd")
	public ResponseEntity<?> addFixedDeposit(FixedDeposit fixedDeposit) {
		return fixedDepositService.addFixedDeposit(fixedDeposit);
	}

	@GetMapping("get-all-fd")
	public ResponseEntity<?> getAllFixedDeposit() {
		return fixedDepositService.getAllFixedDeposit();
	}
}
