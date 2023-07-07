package com.nt.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing/api")
public class BillingInfoController {
	private static Logger logger = LoggerFactory.getLogger(BillingInfoController.class);
	@GetMapping("/info")
	public ResponseEntity<String> showPaymentModes() {
	logger.info("At beginning of showPaymentModes() method--Billing Service");
	ResponseEntity<String> entity = new ResponseEntity<String>(
	"We accept UI Payment/Card Payment/NetBanking Payment", HttpStatus.OK);
	logger.info("At the end of showPaymentModes() method--Billing Service");
	return entity;
	}

}
