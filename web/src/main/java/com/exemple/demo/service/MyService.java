/*
 * Sébastien Leboucher
 */
package com.exemple.demo.service;

import com.exemple.demo.dao.JpaSchoolRepository;
import com.exemple.demo.dao.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final JpaSchoolRepository jpaSchoolRepository;

    public MyService(JpaSchoolRepository jpaSchoolRepository) {
        this.jpaSchoolRepository = jpaSchoolRepository;
    }

    public List<Student> findStudentsByLocationAndName() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return jpaSchoolRepository.findStudentsByLocationAndName("ocation0", "StudentB");
    }
}
