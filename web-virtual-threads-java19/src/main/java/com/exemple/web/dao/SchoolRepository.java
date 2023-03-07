/*
 * Sébastien Leboucher
 */
package com.exemple.web.dao;

import com.exemple.web.dao.domain.School;

import java.util.List;

public interface SchoolRepository {
    List<School> findAllWithCriteriaApi();

    void save(String str);
}
