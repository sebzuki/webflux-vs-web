/*
 * Sébastien Leboucher
 */
package com.exemple.demo.consumer.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@ToString
//@Document
public class UtilisateurMessage implements Serializable {
//    @Id
    private UUID id;
    private String lastName;
    private String firstName;
}
