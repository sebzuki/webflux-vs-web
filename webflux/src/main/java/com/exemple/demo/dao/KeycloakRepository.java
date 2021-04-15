/*
 * Sébastien Leboucher
 */
package com.exemple.demo.dao;

import com.exemple.demo.dao.resource.RealmRole;
import com.exemple.demo.dao.resource.RealmRoleToCreate;
import com.exemple.demo.dao.resource.RealmUser;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

public interface KeycloakRepository {

    /**
     * @return la liste des roles du realm
     */
    Mono<List<RealmRole>> findRoles();

    /**
     * @param rolesToCreate, role à ajouter aux roles du real
     */
    Mono<ClientResponse> addRoles(RealmRoleToCreate rolesToCreate);

    /**
     * @return l'utilisateur trouvé à partir du "username" exacte
     */
    Mono<RealmUser> findUser(String username);

    /**
     * @return la liste des roles du realm attachés au profil de l'utilisateur
     */
    Mono<List<RealmRole>> findUserRoles(UUID userID);

    /**
     * @param rolesToAdd, listes des roles à ajouter au profil de l'utilisateur
     */
    Mono<ClientResponse> addUserRoles(UUID userID, List<RealmRole> rolesToAdd);

    /**
     * @param rolesToRemove, listes des roles à supprimer du profil de l'utilisateur
     */
    Mono<ClientResponse> removeUserRoles(UUID userID, List<RealmRole> rolesToRemove);
}
