package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class MemberProfile1Application {

	public static void main(String[] args) {
		SpringApplication.run(MemberProfile1Application.class, args);
	}
}
