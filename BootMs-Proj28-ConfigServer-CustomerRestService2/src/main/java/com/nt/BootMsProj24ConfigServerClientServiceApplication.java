package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BootMsProj24ConfigServerClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj24ConfigServerClientServiceApplication.class, args);
	}

}
