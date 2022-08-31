package com.nttdata.bootcamp.notification.web.controller;

import com.nttdata.bootcamp.notification.domain.dto.NotificationResponse;
import com.nttdata.bootcamp.notification.domain.dto.email.NotificationEmailResponse;
import com.nttdata.bootcamp.notification.domain.dto.notifyacountopen.NotifyAcountOpenRequest;
import com.nttdata.bootcamp.notification.domain.service.notifyacountopen.NotifyAcountOpenProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api/acountopen-notify")
public class NotifyAcountOpenController {
    private final NotifyAcountOpenProducerService notifyAcountOpenEventProducer;

    @Autowired
    NotifyAcountOpenController(NotifyAcountOpenProducerService notifyAcountOpenEventProducer) {

        this.notifyAcountOpenEventProducer = notifyAcountOpenEventProducer;
    }

    @GetMapping(value = "/test")
    public Flux<String>    test() {

        return Flux.just("Servicio batch correo test ejecutando");
    }

    @PostMapping(value = "/publish")
    public ResponseEntity<NotificationResponse> sendMessageToKafkaTopic(@RequestBody NotifyAcountOpenRequest request) {

        this.notifyAcountOpenEventProducer.sendMessage(request);
        NotificationEmailResponse response=
                NotificationEmailResponse.builder()
                        .build();


        response.setCodResponse("0");
        response.setMessageResponse("Exitoso");

        return new ResponseEntity<>(response,HttpStatus.OK);

    }
}
