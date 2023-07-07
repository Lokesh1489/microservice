package com.nt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.InsuranceServiceConsumerClient;

@RestController
@RequestMapping("/hospital/api")
public class HospitalServiceOperationsController {

	@Autowired
	private InsuranceServiceConsumerClient client;

	@GetMapping("/details")
public String displayHospitalDetails () {
	System.out.println("HospitalController::client comp class name::"+client.getClass());
	return "Insurance Claimed...."+ client.fetchInsuranceDetails();
	}
}
