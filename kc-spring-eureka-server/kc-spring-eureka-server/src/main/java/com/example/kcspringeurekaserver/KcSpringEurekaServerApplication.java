package com.example.kcspringeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KcSpringEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KcSpringEurekaServerApplication.class, args);
	}

}
