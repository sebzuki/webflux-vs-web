/*
 * Sébastien Leboucher
 */
package com.exemple.demo.repository.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Accessors(chain = true)
public class Person {

    @Id
    private Long id;

    private String lastName;

    private String firstName;
}
