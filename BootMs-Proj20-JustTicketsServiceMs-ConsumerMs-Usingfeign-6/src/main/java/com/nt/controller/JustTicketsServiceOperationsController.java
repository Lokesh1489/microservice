package com.nt.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.TheaterServiceConsumerClient;

@RestController
@RequestMapping("/JustTickets/api")
public class JustTicketsServiceOperationsController {

	@Autowired
	private TheaterServiceConsumerClient client;

	@GetMapping("/details")
public String displayTheaterServiceDetails () {
	System.out.println("Theater name ::client comp class name::"+client.getClass());
	return "Your tickets are Booked sucessfully...."+ client.fetchTheaterDetails();
	}
}
