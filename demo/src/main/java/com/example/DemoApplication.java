package com.example;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
		
		// Para arrancar Spring Boot
		SpringApplication.run(DemoApplication.class, args);
		// Loggers
		LOGGER.info("SFDK-LOMEJOR");
		LOGGER.warn("Espavila que la vida te va a comer");
		LOGGER.error("fallaste la baina");
		
		// estos no se muestran por defecto en pantalla
		LOGGER.debug("se debugea y punto");
		LOGGER.trace("una estela de sufrimiento");
		
		// podemos cambiar esta configuración de diversas formas
		// es lo que hemos hecho por ello se muestran hasta el nivel de
		// debuggin logger
	}
}
