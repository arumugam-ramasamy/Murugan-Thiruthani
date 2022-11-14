package com.kohls.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoApplication {

    public static void main(String[] args) {
        //System.setProperty("server.servlet.context-path", "/") ;
        SpringApplication.run(DemoApplication.class, args);
    }

}
