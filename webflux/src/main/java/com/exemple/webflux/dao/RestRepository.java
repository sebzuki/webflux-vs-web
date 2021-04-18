/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.dao;

import com.exemple.webflux.dao.domain.School;
import com.exemple.webflux.dao.domain.Student;
import reactor.core.publisher.Mono;

import java.util.List;

public interface RestRepository {
    Mono<List<Student>> findStudentsByLocationAndName();
}
