package com.coronas.coronasvirustraker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronasvirusTrakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronasvirusTrakerApplication.class, args);
	}

} 
