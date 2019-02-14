package com.group6.healthcare.Spray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class HealthCareSprayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSprayApplication.class, args);
	}

}

