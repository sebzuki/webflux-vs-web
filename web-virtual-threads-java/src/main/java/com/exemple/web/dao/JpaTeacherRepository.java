package com.exemple.web.dao;

import com.exemple.web.dao.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTeacherRepository extends JpaRepository<Teacher, String> {
}
