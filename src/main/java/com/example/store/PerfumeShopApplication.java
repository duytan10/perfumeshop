package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PerfumeShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfumeShopApplication.class, args);
	}
}
