package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsProj04BillingServiceMsProviderMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj04BillingServiceMsProviderMsApplication.class, args);
	}
	@Bean
	public Sampler createSampler() {
	return Sampler.ALWAYS_SAMPLE;
	}

}
