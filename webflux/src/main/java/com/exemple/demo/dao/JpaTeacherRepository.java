package com.exemple.demo.dao;

import com.exemple.demo.dao.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTeacherRepository extends JpaRepository<Teacher, String> {
}
