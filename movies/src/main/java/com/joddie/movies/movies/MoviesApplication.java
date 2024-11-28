package com.joddie.movies.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.joddie.movies.controllers")
@EntityScan(basePackages = "com.joddie.movies.models")
@EnableJpaRepositories(basePackages = "com.joddie.movies.repositories")
@SpringBootApplication(scanBasePackages = "com.joddie.movies")
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
