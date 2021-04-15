package com.exemple.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * Application <em>Spring Boot</em> correspondant au serveur HTTP.
 */
@SpringBootApplication
@Log4j2
@EnableWebFlux
public class WebFluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxApplication.class, args);
        log.info("Démarrage de l'application");
    }
}
