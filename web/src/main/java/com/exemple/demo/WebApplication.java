package com.exemple.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application <em>Spring Boot</em> correspondant au serveur HTTP.
 */
@SpringBootApplication
@Log4j2
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        log.info("Démarrage de l'application");
    }
}
