/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.dao;

import com.exemple.webflux.dao.domain.School;

import java.util.List;

public interface SchoolRepository {
    List<School> findAllWithCriteriaApi();

    void save(String str);
}
