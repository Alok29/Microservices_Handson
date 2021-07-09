package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
public class LoanController {
	@GetMapping(value="/loans/{number}")
	public Loan getLoanDetails(@PathVariable int number) {

		return new Loan("44587125911545","bike",850000,4726,24);
	}
}
