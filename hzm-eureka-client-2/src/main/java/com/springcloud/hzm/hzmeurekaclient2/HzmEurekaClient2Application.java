package com.springcloud.hzm.hzmeurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HzmEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(HzmEurekaClient2Application.class, args);
	}
}
