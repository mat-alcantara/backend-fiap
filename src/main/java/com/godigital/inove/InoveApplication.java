package com.godigital.inove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "com.godigital.inove.repository")
@EntityScan(basePackages = "com.godigital.inove.model")
@ComponentScan(basePackages = {"com.godigital.inove.service", "com.godigital.inove.controller", "com.godigital.inove.config"})
@EnableWebMvc
public class InoveApplication {
	public static void main(String[] args) {
		SpringApplication.run(InoveApplication.class, args);
	}

}
