/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.service;

import com.exemple.webflux.dao.JpaSchoolRepository;
import com.exemple.webflux.dao.RestRepository;
import com.exemple.webflux.dao.domain.Student;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Service
public class MyService {
    private final JpaSchoolRepository jpaSchoolRepository;
    private final RestRepository restRepository;

    public MyService(JpaSchoolRepository jpaSchoolRepository, RestRepository restRepository) {
        this.jpaSchoolRepository = jpaSchoolRepository;
        this.restRepository = restRepository;
    }

    public Mono<List<Student>> findStudentsByLocationAndName() {
        return Mono.just(jpaSchoolRepository.findStudentsByLocationAndName("ocation0", "StudentB"))
                .delayElement(Duration.ofMillis(150));
    }

    public Flux<Student> findStudentsByLocationAndNameFlux() {
        return Flux.create((FluxSink<Student> fluxSink) -> {

            jpaSchoolRepository.findStudentsByLocationAndName("ocation0", "Student")
                    .forEach(fluxSink::next);

            // fluxSink.complete(); // obligatoire si vous fait une requete http std

        }).delayElements(Duration.ofMillis(800));
    }

    public Mono<List<Student>> findOthersStudentsByLocationAndName() {
        return restRepository.findStudentsByLocationAndName();
    }
}
