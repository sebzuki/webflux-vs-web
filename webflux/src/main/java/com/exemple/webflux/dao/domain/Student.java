package com.exemple.webflux.dao.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(generator = "studentIds")
    @SequenceGenerator(name = "studentIds",
            sequenceName = "student_id_seq",
            allocationSize = 20)
    private long id;

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}
