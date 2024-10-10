package com.demo.hibernate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("dev")
    public String devDatabaseConnection() {
        System.out.println("Conectando a H2 en el entorno de desarrollo");
        return "Base de datos H2 para DEV";
    }

    @Bean
    @Profile("prod")
    public String prodDatabaseConnection() {
        System.out.println("Conectando a MySQL en el entorno de producción");
        return "Base de datos MySQL para PROD";
    }
}
