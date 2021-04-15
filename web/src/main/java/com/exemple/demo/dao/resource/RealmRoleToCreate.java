/*
 * Sébastien Leboucher
 */
package com.exemple.demo.dao.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class RealmRoleToCreate {

    private String name;
}
