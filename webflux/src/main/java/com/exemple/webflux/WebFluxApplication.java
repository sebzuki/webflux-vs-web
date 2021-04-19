package com.exemple.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;

import static javax.persistence.Persistence.createEntityManagerFactory;
import static org.hibernate.reactive.stage.Stage.SessionFactory;

/**
 * Application <em>Spring Boot</em> correspondant au serveur HTTP.
 */
@SpringBootApplication
@EnableWebFlux
public class WebFluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxApplication.class, args);
    }

}
