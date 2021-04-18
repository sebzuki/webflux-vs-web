/*
 * Sébastien Leboucher
 */
package com.exemple.web.dao.impl;

import com.exemple.web.dao.RestRepository;
import com.exemple.web.dao.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class RestRepositoryImpl implements RestRepository {
    private final RestTemplate restTemplate;

    public RestRepositoryImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Student> findStudentsByLocationAndName() {
        return Arrays.asList(
                Objects.requireNonNull(
                        restTemplate.getForObject("http://localhost:8082/load", Student[].class)));
    }
}
