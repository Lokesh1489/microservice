package com.nt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingServiceRestConsumer;

@RestController
@RequestMapping("/shopping")
public class ShoppingServiceOperationsController {

	@Autowired
	private BillingServiceRestConsumer client;

	@GetMapping("/details")
	public ResponseEntity<String> showBillingDetails(){
		String resultBody = client.getBillingInfo();
		String billingInfo = "Bill Amount"+ new Random().nextInt(100000);
		return new ResponseEntity<String> (billingInfo+billingInfo+"......"+resultBody,HttpStatus.OK);
	}
}
