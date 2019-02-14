package com.group6.healthcare.tablets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HealthCareTabletsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareTabletsApplication.class, args);
	}

}

