/*
 * Sébastien Leboucher
 */
package com.exemple.demo.service;

import com.exemple.demo.repository.PersonRepository;
import com.exemple.demo.repository.domain.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@Service
public class MyService {
    private final PersonRepository personRepository;

    public MyService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public Mono<Void> save() {
        return personRepository.saveAll(List.of(
                new Person()
                        .setFirstName("Mark")
                        .setLastName("Seb"),
                new Person()
                        .setFirstName("Job")
                        .setLastName("Hamil"))).then();
    }

    public Mono<Person> findStudentsByLocationAndName() {
        return Mono.defer(() -> Mono.just(
                new Person().setFirstName("Mark").setLastName("Seb")
        ).delayElement(Duration.ofMillis(100)));
        // return personRepository.findById(1L);
    }
}
