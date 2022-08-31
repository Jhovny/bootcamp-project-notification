package com.nttdata.bootcamp.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class NotificationApplication implements CommandLineRunner {

	/** Declaración de la variable de log */
	private static final Logger log = LoggerFactory.getLogger(NotificationApplication.class);

	/** Creación del método main y sus argumentos */
	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	/** Creación del método run y sus argumentos */
	@Override
	public void run(String... args) throws Exception {
		log.info("Init Project");
	}

}

