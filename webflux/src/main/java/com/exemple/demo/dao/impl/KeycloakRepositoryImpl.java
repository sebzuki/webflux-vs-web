/*
 * Sébastien Leboucher
 */
package com.exemple.demo.dao.impl;

import com.exemple.demo.configuration.ProviderConfiguration;
import com.exemple.demo.dao.KeycloakRepository;
import com.exemple.demo.dao.resource.RealmRole;
import com.exemple.demo.dao.resource.RealmRoleToCreate;
import com.exemple.demo.dao.resource.RealmUser;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
public class KeycloakRepositoryImpl implements KeycloakRepository {
    private static final String ID = "#USER_ID#";
    private static final String USERNAME = "#USERNAME#";

    private final ProviderConfiguration configuration;
    private final WebClient webClient;

    public KeycloakRepositoryImpl(ProviderConfiguration configuration, WebClient webClient) {
        this.configuration = configuration;
        this.webClient = webClient;
    }

    @Override
    public Mono<List<RealmRole>> findRoles() {
        return webClient.get().uri(configuration.getRealmRolesList())
                .retrieve()
                .bodyToMono(RealmRole[].class)
                .map(Arrays::asList);
    }

    @Override
    public Mono<ClientResponse> addRoles(RealmRoleToCreate rolesToCreate) {
        return webClient.post().uri(configuration.getRealmRolesList())
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(rolesToCreate), RealmRoleToCreate.class)
                .exchange();
    }

    @Override
    public Mono<RealmUser> findUser(String username) {
        return webClient.get()
                .uri(configuration.getRealmUsersList().replace(USERNAME, username))
                .retrieve()
                .bodyToMono(RealmUser[].class)
                .map(realmUsers -> Arrays.stream(realmUsers)
                        .findFirst()
                        .orElseThrow(() -> new IllegalStateException("Plusieurs utilisateurs pour le même username = " + username)));
    }

    @Override
    public Mono<List<RealmRole>> findUserRoles(UUID userID) {
        return webClient.get()
                .uri(configuration.getUserRolesAdmin().replace(ID, userID.toString()))
                .retrieve()
                .bodyToMono(RealmRole[].class)
                .map(Arrays::asList);
    }

    @Override
    public Mono<ClientResponse> addUserRoles(UUID userID, List<RealmRole> rolesToAdd) {
        return webClient.post()
                .uri(configuration.getUserRolesAdmin().replace(ID, userID.toString()))
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(rolesToAdd), List.class)
                .exchange();
    }

    @Override
    public Mono<ClientResponse> removeUserRoles(UUID userID, List<RealmRole> rolesToRemove) {
        return webClient
                .method(HttpMethod.DELETE)
                .uri(configuration.getUserRolesAdmin().replace(ID, userID.toString()))
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(rolesToRemove), List.class)
                .exchange();
    }
}
