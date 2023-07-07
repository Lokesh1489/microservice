package com.nt.controller;

import java.util.Random;

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

	@GetMapping("/details")
public String displayshoppingDetails () {
	System.out.println("ShoppingController::client comp class name::"+client.getClass());
	return "pongal shopping for family...."+ client.fetchBillDetails();
	}
}
