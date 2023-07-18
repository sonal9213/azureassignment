package com.assignment5AdvanceJava.Assignment5AdvanceJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.assignment5AdvanceJava.Assignment5AdvanceJava;"})
public class Assignment5AdvanceJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment5AdvanceJavaApplication.class, args);
	}
	

}
