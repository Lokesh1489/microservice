package com.nt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.MessageGeneratorServiceConsumerClient;

@RestController
@RequestMapping("/WishMessage/api")
public class WishMessageServiceOperationsController {

	@Autowired
	private MessageGeneratorServiceConsumerClient client;

	@GetMapping("/details")
public String displayWishMessageServiceDetails () {
	System.out.println("Wish Message ::client comp class name::"+client.getClass());
	return "Wish Message ...."+ client.fetchMessageGeneratorDetails();
	}
}
