package com.springcloud.hzm.hzmeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HzmEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzmEurekaClientApplication.class, args);
	}
}
