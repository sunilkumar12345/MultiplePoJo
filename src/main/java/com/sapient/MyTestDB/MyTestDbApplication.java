package com.sapient.MyTestDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyTestDbApplication {

	public static void main(String[] args) {
		System.out.println("MAIN");
		SpringApplication.run(MyTestDbApplication.class, args);
	}
}
