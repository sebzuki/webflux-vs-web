/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.service;

import com.exemple.webflux.dao.domain.Student;
import com.exemple.webflux.dao.impl.SchoolRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class MyService {
    private final SchoolRepository schoolRepository;

    public MyService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public Mono<List<Student>> findStudentsByLocationAndNameMono(String id) {
        return schoolRepository.findStudentsByLocationAndNameMono("Location"+id, "StudentA"+id);
    }

    public Flux<Student> findStudentsByLocationAndNameFlux() {
        return schoolRepository.findStudentsByLocationAndName("Location0", "StudentA0");
    }
}
