/*
 * Sébastien Leboucher
 */
package com.exemple.demo.controller;

import com.exemple.demo.consumer.domain.UtilisateurMessage;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequestMapping("/")
@RestController
public class TestController {
    private final KafkaTemplate<String, UtilisateurMessage> kafkaTemplate;

    public TestController(KafkaTemplate<String, UtilisateurMessage> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("publish")
    public Mono<Void> publish() {
        UUID uuid = UUID.randomUUID();
        kafkaTemplate.send("test",
                uuid.toString(),
                new UtilisateurMessage()
                        .setId(uuid)
                        .setFirstName("sebastiel")
                        .setLastName("Seb-" + Math.round(Math.random() * 100)));
        return Mono.empty();
    }
}
