/*
 * Sébastien Leboucher
 */
package com.exemple.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
//@EnableR2dbcRepositories
public class Config {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .build();
    }

//    @Bean
//    public ConnectionFactory connectionTestFactory() {
//
//        ConnectionFactory connectionFactory = ConnectionFactories.get("r2dbc:h2:mem:///test?options=DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
//
//        R2dbcEntityTemplate template = new R2dbcEntityTemplate(connectionFactory);
//
//        template.getDatabaseClient().sql("CREATE TABLE PERSON\n" +
//                "(\n" +
//                "    ID            BIGINT IDENTITY PRIMARY KEY,\n" +
//                "    LAST_NAME        VARCHAR(100),\n" +
//                "    FIRST_NAME        VARCHAR(100)\n" +
//                ");")
//                .fetch()
//                .rowsUpdated()
//                .subscribe();
//        return connectionFactory;
//    }
}
