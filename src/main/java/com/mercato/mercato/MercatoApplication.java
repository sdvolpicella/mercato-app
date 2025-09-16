package com.mercato.mercato;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MercatoApplication {

    private static final Logger logger = LoggerFactory.getLogger(MercatoApplication.class);

    public static void main(String[] args) {
        logger.info("Applicazione in partenza...");
        SpringApplication.run(MercatoApplication.class, args);
	}

}
