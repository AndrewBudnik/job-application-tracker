package com.andrew.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);

		System.out.println("Testing...");
		System.out.println("Testing...");
		System.out.println("The application is running and printing to the console");
	}
}
