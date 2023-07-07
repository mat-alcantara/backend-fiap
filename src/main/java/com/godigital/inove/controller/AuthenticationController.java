package com.godigital.inove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.godigital.inove.service.AuthService;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthService authenticationService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestParam String email, @RequestParam String password) {
        String jwt = authenticationService.authenticate(email, password);

        if (jwt != null) {
            return ResponseEntity.ok().header("Authorization", "Bearer " + jwt).build();
        } else {
            return ResponseEntity.status(401).body("Authentication failed"); // Trate os erros de autenticação de maneira adequada
        }
    }
}
