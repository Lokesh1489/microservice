package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient

public class SpringBootMsProj05InsuranceServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsProj05InsuranceServiceProviderApplication.class, args);
	}

}
