package com.evolutionary.sbfirst;

import com.evolutionary.sbfirst.model.Employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbfirstApplication {
    private static final Logger LOGGER =  LogManager.getLogger(SbfirstApplication.class);
    public static void main(String[] args) {
        LOGGER.info("Application Started");
        SpringApplication.run(SbfirstApplication.class, args);
    }

}
