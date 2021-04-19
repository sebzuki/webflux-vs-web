/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.dao.impl;


import com.exemple.webflux.dao.config.MonoSessionFactory;
import com.exemple.webflux.dao.domain.Student;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Log4j2
@Repository
public class SchoolRepository {
    private final MonoSessionFactory factory;

    public SchoolRepository(MonoSessionFactory factory) {
        this.factory = factory;
    }

    public Mono<List<Student>> findStudentsByLocationAndNameMono(String location, String studentName) {
        return factory.withMonoSession(
                session -> session.createQuery(
                                "SELECT st FROM School sc "
                                        + "LEFT JOIN sc.students st "
                                        + "WHERE sc.location = :location AND st.name = :studentName "
                                        + "ORDER BY st.name", Student.class)
                        .setParameter("location", location)
                        .setParameter("studentName", studentName)
                        .getResultList());
    }

    public Flux<Student> findStudentsByLocationAndName(String location, String studentName) {
        Flux<Student> studentFlux = Flux.create(sink -> factory.withSession(
                        session -> session.createQuery(
                                        "SELECT st FROM School sc "
                                                + "LEFT JOIN sc.students st "
                                                + "WHERE sc.location = :location "
                                                + "AND st.name = :studentName "
                                                + "ORDER BY st.name ",
                                        Student.class)
                                .setParameter("location", location)
                                .setParameter("studentName", studentName)
                                .getResultList())
                .toCompletableFuture()
                .whenComplete((students, throwable) -> {
                    students.forEach(sink::next);
                    sink.complete();
                }));
        log.info("coucouF");
        return studentFlux;
    }

    public void save(String str) {
        //
    }
}
