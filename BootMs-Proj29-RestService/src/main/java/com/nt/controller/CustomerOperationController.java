package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cust")
public class CustomerOperationController {
	@GetMapping("/display")
	public String displayData() {
		return "(Customer) Customer Info will be displayed here...welcome Call Center";
	}
}
