package com.exemple.webflux.dao.config;

import org.hibernate.reactive.stage.Stage.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static javax.persistence.Persistence.createEntityManagerFactory;

@Configuration
public class ReactiveDbConfig {

    @Bean
    MonoSessionFactory createEm() {
        return new MonoSessionFactory(createEntityManagerFactory("postgresql-example").unwrap(SessionFactory.class));
    }
}
