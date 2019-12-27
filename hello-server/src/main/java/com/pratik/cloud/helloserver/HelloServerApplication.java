package com.pratik.cloud.helloserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@ComponentScan
public class HelloServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServerApplication.class, args);
	}

}
