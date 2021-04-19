package com.exemple.webflux.dao.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "TEACHER",
        indexes = @Index(name = "school_teacher_index", columnList = "school_id"))
public class Teacher {

    @Id
    @GeneratedValue(generator = "teacherIds")
    @SequenceGenerator(name = "teacherIds",
            sequenceName = "teacher_id_seq",
            allocationSize = 20)
    private long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id") // optionnel
    private School school;

    public Teacher() {
    }

    public Teacher(String name, School school) {
        this.name = name;
        this.school = school;
    }
}
