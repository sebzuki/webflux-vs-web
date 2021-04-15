/*
 * Sébastien Leboucher
 */
package com.exemple.demo.consumer;

import com.exemple.demo.consumer.domain.UtilisateurMessage;
import com.exemple.demo.service.RealmService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class UtilisateurConsumer {
    private final RealmService realmService;

    public UtilisateurConsumer(RealmService realmService) {
        this.realmService = realmService;
    }

    @KafkaListener(topics = "test", groupId = "toto")
    public void consumer(ConsumerRecord<String, UtilisateurMessage> record) {
        realmService.synchronizeUser(record.value());
    }
}
