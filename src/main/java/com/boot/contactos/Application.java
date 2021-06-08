package com.boot.contactos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.boot.contactos.controller", "com.boot.contactos.dao","com.boot.contactos.service"})
@EntityScan(basePackages = {"com.boot.contactos.model"})
@EnableJpaRepositories(basePackages = {"com.boot.contactos.dao"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
