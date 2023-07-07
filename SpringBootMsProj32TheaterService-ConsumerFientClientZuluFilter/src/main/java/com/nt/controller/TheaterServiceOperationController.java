package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.TheaterServiceCont;


@RestController
@RequestMapping("/hospital")
public class TheaterServiceOperationController {
	
	@Autowired
	private TheaterServiceCont controller;
	
	@GetMapping("/details")
	public String getTheaterInfo(){
		
		return  "The Ticket "+controller.fetchTicketinfo();
	}

}
