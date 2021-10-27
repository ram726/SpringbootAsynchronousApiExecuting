package com.example.SpringbootAsyncApiCall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbokAsyncApiCallApplication {

	public static void main(String[] args) {
		SpringApplication
				.run(SpringbokAsyncApiCallApplication.class, args);
	}
}