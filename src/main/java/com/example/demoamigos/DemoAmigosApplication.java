package com.example.demoamigos;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.demoamigos.user"})
public class DemoAmigosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAmigosApplication.class, args);
	}

}
