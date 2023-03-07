/*
 * Sébastien Leboucher
 */
package com.exemple.web.dao;

import com.exemple.web.dao.domain.Student;

import java.util.List;

public interface RestRepository {
    List<Student> findStudentsByLocationAndName();
}
