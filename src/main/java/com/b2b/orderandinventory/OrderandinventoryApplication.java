package com.b2b.orderandinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OrderandinventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderandinventoryApplication.class, args);
	}

}
