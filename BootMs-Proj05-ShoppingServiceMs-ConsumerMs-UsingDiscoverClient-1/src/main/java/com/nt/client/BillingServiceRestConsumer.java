package com.nt.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillingServiceRestConsumer {

	@Autowired
	private DiscoveryClient client; // client component comes through auto-cofiguration

	public String getBillingInfo() {
		// find and get serviceInstances of producer by using service id
		List<ServiceInstance> listSI = client.getInstances("Billing-Service");
		// use first serviceinstance from the list of instances
		ServiceInstance instance = listSI.get(0);
		// get producer MS URI and make it as URL
		String url = instance.getUri() + "/billing/info";

		// create RestTemplate object
		RestTemplate template = new RestTemplate();
		// invoke the producer Ms service method or operation by generating HTTP call
		String response = template.getForObject(url, String.class);
		return response;
	}
}
