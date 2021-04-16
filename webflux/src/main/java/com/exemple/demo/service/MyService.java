/*
 * Sébastien Leboucher
 */
package com.exemple.demo.service;

import com.exemple.demo.dao.JpaSchoolRepository;
import com.exemple.demo.dao.domain.Student;
import org.springframework.stereotype.Service;
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
//        return Mono.just(List.of(new Student())).delayElement(Duration.ofMillis(200));

        return Mono.just(jpaSchoolRepository.findStudentsByLocationAndName("ocation0", "StudentB"))
                        .delayElement(Duration.ofMillis(150));
    }
}
