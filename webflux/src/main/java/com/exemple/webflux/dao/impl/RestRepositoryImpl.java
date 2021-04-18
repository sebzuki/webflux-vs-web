/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.dao.impl;

import com.exemple.webflux.dao.RestRepository;
import com.exemple.webflux.dao.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Component
public class RestRepositoryImpl implements RestRepository {
    private final WebClient webClient;

    public RestRepositoryImpl(WebClient webClient) {
        this.webClient = webClient;
    }


    @Override
    public Mono<List<Student>> findStudentsByLocationAndName() {
        return webClient.get()
                .uri("http://localhost:8083/load")
                .retrieve()
                .bodyToMono(Student[].class)
                .map(Arrays::asList);
    }
}
