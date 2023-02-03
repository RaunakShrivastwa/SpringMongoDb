package com.PostgreSql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbApplication.class, args);
		System.out.println("Project is running...");
	}

}
