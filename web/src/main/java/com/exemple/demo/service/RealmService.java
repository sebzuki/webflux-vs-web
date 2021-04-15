/*
 * Sébastien Leboucher
 */
package com.exemple.demo.service;

import com.exemple.demo.consumer.domain.UtilisateurMessage;
import com.exemple.demo.dao.KeycloakRepository;
import com.exemple.demo.dao.resource.RealmRoleToCreate;
import org.springframework.stereotype.Service;

@Service
public class RealmService {
    private final KeycloakRepository repository;

    public RealmService(KeycloakRepository repository) {
        this.repository = repository;
    }

    public void synchronizeUser(UtilisateurMessage message) {
        repository.addRoles(new RealmRoleToCreate().setName("testA")).subscribe(
                response -> repository.findRoles().subscribe(
                        realmRoles -> repository.findUser(message.getFirstName()).subscribe(
                                user -> repository.findUserRoles(user.getId()).subscribe(
                                        realmRoles1 -> realmRoles1.forEach(System.out::println)))
                ));
    }
}
