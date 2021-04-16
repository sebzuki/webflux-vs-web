/*
 * Sébastien Leboucher
 */
package com.exemple.demo.service;

import com.exemple.demo.dao.JpaSchoolRepository;
import com.exemple.demo.dao.domain.Student;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Service
public class MyService {
    private final JpaSchoolRepository jpaSchoolRepository;

    public MyService(JpaSchoolRepository jpaSchoolRepository) {
        this.jpaSchoolRepository = jpaSchoolRepository;
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
}
