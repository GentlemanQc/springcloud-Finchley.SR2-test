package com.gentlemanqc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudDemoUserApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemoUserApiApplication.class, args);
	}
}
