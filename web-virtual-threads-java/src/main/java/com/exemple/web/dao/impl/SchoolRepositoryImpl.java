/*
 * Sébastien Leboucher
 */
package com.exemple.web.dao.impl;


import com.exemple.web.dao.SchoolRepository;
import com.exemple.web.dao.domain.School;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchoolRepositoryImpl implements SchoolRepository {
    private final EntityManager em;

    public SchoolRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    // JPA’s Criteria API
    @Override
    public List<School> findAllWithCriteriaApi() {
        return em.createQuery("select distinct sc from School sc" +
                        " LEFT JOIN FETCH sc.director" +
                        " LEFT JOIN FETCH sc.students" +
                        " LEFT JOIN FETCH sc.teachers ", School.class)
                .getResultList();
    }

    @Override
    public void save(String str) {
        //
    }
}
