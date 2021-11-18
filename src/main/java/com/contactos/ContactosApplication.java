package com.contactos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"com.contactos.controller","com.contactos.dao","com.contactos.service"})
@EntityScan(basePackages = {"com.contactos.model"})
@EnableJpaRepositories(basePackages = {"com.contactos.dao"})
@SpringBootApplication
public class ContactosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactosApplication.class, args);
	}

}
