package com.techneis.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServiceDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceDiscoveryClientApplication.class, args);
	}

}
