package com.godigital.inove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.godigital.inove.repository")
@EntityScan(basePackages = "com.godigital.inove.model")
@ComponentScan("com.godigital.inove.controller")
public class InoveApplication {
	public static void main(String[] args) {
		SpringApplication.run(InoveApplication.class, args);
	}

}
