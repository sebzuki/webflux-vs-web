/*
 * Sébastien Leboucher
 */
package com.exemple.webflux.dao.config;

import org.hibernate.reactive.stage.Stage;
import org.hibernate.reactive.stage.Stage.SessionFactory;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

public class MonoSessionFactory {
    private final SessionFactory factory;

    public MonoSessionFactory(SessionFactory factory) {
        this.factory = factory;
    }

    public <T> Mono<T> withMonoSession(Function<Stage.Session, CompletionStage<T>> work) {
        return Mono.fromFuture(factory.withSession(work).toCompletableFuture());
    }

    public <T> CompletableFuture<T> withSession(Function<Stage.Session, CompletionStage<T>> work) {
        return factory.withSession(work).toCompletableFuture();
    }
}
