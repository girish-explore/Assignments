package com.banking.transferapi.bankpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

public class BankpaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankpaymentApplication.class, args);
	}

}
