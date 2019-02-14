package com.group6.healthcare.Syrup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HealthCareSyrupApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSyrupApplication.class, args);
	}

}

