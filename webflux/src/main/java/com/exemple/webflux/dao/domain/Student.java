package com.exemple.webflux.dao.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
}
