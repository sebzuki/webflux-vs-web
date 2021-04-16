/*
 * Sébastien Leboucher
 */
package com.exemple.demo.dao;

import com.exemple.demo.dao.domain.School;

import java.util.List;

public interface SchoolRepository {
    List<School> findAllWithCriteriaApi();

    void save(String str);
}
