package com.demo.profile.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Value("${app.database.url}")
    private String databaseUrl;

    @Value("${app.database.driverClassName}")
    private String driverClassName;

    @Value("${app.database.username}")
    private String username;

    @Value("${app.database.password}")
    private String password;

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
