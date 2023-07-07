package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class InsuranceServiceController {

	@GetMapping("info")
	public String getInsuranceInfo() {
		return "the price is 150 rupees in Silver class and 200 in Golden class";
	}

}
