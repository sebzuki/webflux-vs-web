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
@Table(name = "DIRECTOR")
public class Director {

    @Id
    @GeneratedValue(generator = "directorIds")
    @SequenceGenerator(name = "directorIds",
            sequenceName = "director_id_seq",
            allocationSize = 20)
    private long id;

    private String name;

    public Director() {
    }

    public Director(String name) {
        this.name = name;
    }
}
