/*
 * Sébastien Leboucher
 */
package com.exemple.demo.dao.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class RealmUser {

    private UUID id;
    private String createdTimestamp;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private boolean enabled;
    private boolean emailVerified;
}
