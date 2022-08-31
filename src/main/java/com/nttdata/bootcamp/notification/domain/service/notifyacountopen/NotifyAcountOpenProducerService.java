package com.nttdata.bootcamp.notification.domain.service.notifyacountopen;

import com.google.gson.Gson;
import com.nttdata.bootcamp.notification.domain.dto.notifyacountopen.NotifyAcountOpenRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class NotifyAcountOpenProducerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotifyAcountOpenProducerService.class);
    private final KafkaTemplate<String, String> kafkaTemplate;
    public NotifyAcountOpenProducerService(@Qualifier("kafkaStringTemplate") KafkaTemplate<String,
                                String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(NotifyAcountOpenRequest request) {
        Gson gson = new Gson();
        LOGGER.info("Producing message {}", "Mensaje enviado");
        this.kafkaTemplate.send("TOPIC-PRODUCTOS-APERTURADO", gson.toJson(request));
    }
}