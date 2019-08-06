package com.sathya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaCloudServerForRandDApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaCloudServerForRandDApplication.class, args);
	}

}
