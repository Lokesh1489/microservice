package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.context.annotation.RequestScope;

@SpringBootApplication
@EnableEurekaClient
@RequestScope
public class BootMsProj23ConfigServerClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj23ConfigServerClientServiceApplication.class, args);
	}

}
