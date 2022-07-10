package com.ghy.boot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAdminServer
@SpringBootApplication
public class Springboot5Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot5Application.class, args);
    }

}
