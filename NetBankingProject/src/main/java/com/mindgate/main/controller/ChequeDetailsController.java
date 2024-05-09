package com.mindgate.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.ChequeDetails;
import com.mindgate.main.service.ChequeDetailsServiceInterface;

@RestController
@RequestMapping("cheque")
public class ChequeDetailsController {

	@Autowired
	private ChequeDetailsServiceInterface chequeDetailsService;

	@PostMapping("add-cheque")
	public ResponseEntity<?> addChequeDetails(ChequeDetails chequeDetails) {
		return chequeDetailsService.addChequeDeposit(chequeDetails);
	}

	@GetMapping("get-all-cheque")
	public ResponseEntity<?> getAllChequeDetails() {
		return chequeDetailsService.getAllChequeDeposits();
	}
}
