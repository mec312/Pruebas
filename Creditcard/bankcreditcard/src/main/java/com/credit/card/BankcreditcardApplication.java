package com.credit.card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BankcreditcardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankcreditcardApplication.class, args);
	}

}
