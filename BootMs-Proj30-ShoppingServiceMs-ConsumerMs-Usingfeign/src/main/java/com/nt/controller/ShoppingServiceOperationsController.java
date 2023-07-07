package com.nt.controller;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingServiceConsumerClient;

@RestController
@RequestMapping("/shopping/api")
public class ShoppingServiceOperationsController {

	@Autowired
	private BillingServiceConsumerClient client;

	private Logger logger = LoggerFactory.getLogger(ShoppingServiceOperationsController.class);
@GetMapping("/details")
	public ResponseEntity<String> displayShoppingDetails() {
	logger.info("At beginning of displayShoppingDetails() method--Shopping Service");
	// use Client component support to invoke provider MS service
	logger.info("before calling provider MS");
	ResponseEntity<String> entity = client.fetchBillDetails();
	String resultBody = entity.getBody(); // Provider MS result
	logger.info("After calling provider MS");
	String billInfo = "Bill Amount::" + new Random().nextInt(100000);// consumer MS result
	logger.info("At End of displayShoppingDetails() method--Shopping Service");
	return new ResponseEntity<String>(billInfo + "...." + resultBody, HttpStatus.OK);
	}

}
