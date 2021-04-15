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
public class RealmRole {

    private UUID id;
    private String name;
    private String containerId;
    private boolean composite;
    private boolean clientRole;
}
