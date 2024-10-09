package com.demo.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerfilController {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @GetMapping("/perfil")
    public String getActiveProfile() {
        return "El perfil activo es: " + activeProfile;
    }
}
