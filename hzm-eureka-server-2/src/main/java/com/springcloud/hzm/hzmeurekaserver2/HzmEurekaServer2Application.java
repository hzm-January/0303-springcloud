package com.springcloud.hzm.hzmeurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HzmEurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(HzmEurekaServer2Application.class, args);
	}
}
