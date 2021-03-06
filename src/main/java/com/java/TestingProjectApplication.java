package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.java" })
public class TestingProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestingProjectApplication.class, args);
	}

}
