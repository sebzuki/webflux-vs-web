/*
 * Sébastien Leboucher
 */
package com.exemple.web.service;

import com.exemple.web.dao.JpaSchoolRepository;
import com.exemple.web.dao.RestRepository;
import com.exemple.web.dao.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final JpaSchoolRepository jpaSchoolRepository;
    private final RestRepository restRepository;


    public MyService(JpaSchoolRepository jpaSchoolRepository, RestRepository restRepository) {
        this.jpaSchoolRepository = jpaSchoolRepository;
        this.restRepository = restRepository;
    }

    public List<Student> findStudentsByLocationAndName() throws InterruptedException {
        Thread.sleep(150);
        return jpaSchoolRepository.findStudentsByLocationAndName("ocation0", "StudentB");
    }

    public List<Student> findOthersStudentsByLocationAndName() {
        return restRepository.findStudentsByLocationAndName();
    }
}
