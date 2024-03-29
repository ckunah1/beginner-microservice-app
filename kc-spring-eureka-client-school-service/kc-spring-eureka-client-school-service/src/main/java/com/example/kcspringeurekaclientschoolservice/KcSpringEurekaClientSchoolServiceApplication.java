package com.example.kcspringeurekaclientschoolservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class KcSpringEurekaClientSchoolServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KcSpringEurekaClientSchoolServiceApplication.class, args);
	}

}
