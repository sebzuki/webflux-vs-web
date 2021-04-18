package com.exemple.web.dao;

import com.exemple.web.dao.domain.School;
import com.exemple.web.dao.domain.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaSchoolRepository extends JpaRepository<School, String> {
    // 1 seule requete, fait un produit cartesien, super rapide si les grappes sont de tailles résonnables (<100)
    // JPQL pur (Java Persistence Query Language), syntaxe controlée au démarrage, idéal pour récupération d'une seule grappe
    @Query("SELECT distinct sc FROM School sc" +
            " INNER JOIN FETCH sc.director" +
            " LEFT JOIN FETCH sc.students" +
            " LEFT JOIN FETCH sc.teachers ")
    List<School> findAllWithJPQL();

    // 1 seule requete, syntaxe controlée au runtime
    @EntityGraph(value = "school.full")
    @Query("SELECT sc FROM School sc")
    List<School> findAllWithGraphName();

    // 1 seule requete, syntaxe controlée au runtime
    // org.hibernate.loader.MultipleBagFetchException si on met plusieurs List dans l'entite au lieu des Set
    @EntityGraph(attributePaths = {"director", "students", "teachers"})
    List<School> findAll();

    // 4 requetes avec le count que l'on peut surcharger
    // pas toute la grappe ici pour répondre au "Hibernate N+1 query problem" avec une requete supplémentaire en mode BatchSize pour chaque OneToMany
    // Sinon erreur : "HHH000104: firstResult/maxResults specified with collection fetch; applying in memory"
    // On ne peut pas mélanger fetch et pagination, sinon on tronquerait les résultats, la BD ne le permet pas
    // le OneToOne ne pose pas de probleme car c'est le même tuple !! Donc il ne casse pas l'optimisation de la base
    @EntityGraph(attributePaths = {"director"})
    @Query("SELECT sc FROM School sc")
    Page<School> findAllPagination(Pageable pageable);

    // 3 requetes sans le count
    // pas toute la grappe ici pour répondre au "Hibernate N+1 query problem" avec une requete supplémentaire en mode BatchSize pour chaque OneToMany
    // le OneToOne ne pose pas de probleme car c'est le même tuple !!
    @EntityGraph(attributePaths = {"director"})
    @Query("SELECT sc FROM School sc")
    Slice<School> findAllSlice(Pageable pageable);

    // Failed to initialize a collection si on oublie l'entity graph !
    // 31ms si on récupère 10 éléments Scool avec tous les JOINs
    // 36ms si on récupère 10 éléments Scool avec seulement le OneToOne et les BatchSize + SubSELECT
    // 50ms sans optim (34 requetes)
    @EntityGraph(attributePaths = {"director", "students", "teachers"})
    List<School> findByLocation(String location);

    @EntityGraph(attributePaths = {"director", "students", "teachers"})
    List<School> findByLocationOrderByName(String location);

    @EntityGraph(attributePaths = {"director", "students", "teachers"})
    @Query("SELECT sc FROM School sc " +
           "WHERE sc.location LIKE %:location% " +
           "ORDER BY sc.name ")
    List<School> findCustom(@Param("location") String location);

    // Filtrer la sous collection
    @Query("SELECT distinct sc FROM School sc " +
           "INNER JOIN FETCH sc.director " + // seulement les écoles avec Director
           "LEFT JOIN FETCH sc.students st " +
           "LEFT JOIN FETCH sc.teachers te " +
           "WHERE sc.location LIKE %:location% " +
           "AND st.name LIKE %:studentName% " +
           "ORDER BY sc.name ")
    List<School> findCustomJoin(
            @Param("location") String location,
            @Param("studentName") String studentName
    );

    // ici je peux renvoyer autre chose que School car ça ne rentre pas en conflit avec les requetes de base qui sont paramétrées
    @Query("SELECT st FROM School sc " +
           "LEFT JOIN sc.students st " +
           "WHERE sc.location LIKE %:location " +
           "AND st.name LIKE :studentName% " +
           "ORDER BY st.name ")
    List<Student> findStudentsByLocationAndName(
            @Param("location") String location,
            @Param("studentName") String studentName
    );
}
