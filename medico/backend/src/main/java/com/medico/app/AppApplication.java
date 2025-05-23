package com.medico.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.medico.app.repositories")
public class AppApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppApplication.class, args);
	}

}
