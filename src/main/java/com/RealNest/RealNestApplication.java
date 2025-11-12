package com.RealNest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealNestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealNestApplication.class, args);
		System.out.println("✅ Swagger running at: http://localhost:8082/swagger-ui.html");

	}

}
