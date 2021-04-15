package com.exemple.demo.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration des urls du realm keycloak
 */
@Configuration
@ConfigurationProperties(prefix = "provider")
@Getter
@Setter
public class ProviderConfiguration {

    private String name;
    private String baseAdmin;
    private String  realmUsersList;
    private String  realmRolesList;
    private String  userRolesAdmin;
}
