package com.banking.transfer.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {

	public static void main(String[] args) {
		System.out.println("Gatway Called--------------------------------\n");
		SpringApplication.run(GatewayApplication.class, args);
	}

}
