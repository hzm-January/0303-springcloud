package com.springcloud.hzm.hzmeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HzmEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HzmEurekaServerApplication.class, args);
	}
}
