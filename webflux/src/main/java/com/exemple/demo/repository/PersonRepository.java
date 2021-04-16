/*
 * Sébastien Leboucher
 */
package com.exemple.demo.repository;

import com.exemple.demo.repository.domain.Person;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {

    Flux<Person> findAll();

    @Query("SELECT id, last_Name, first_name FROM person WHERE last_Name LIKE :lastName")
    Flux<Person> findByLastName(String lastName);
}
