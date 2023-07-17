package com.godigital.inove.controller;

import com.godigital.inove.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.godigital.inove.service.AuthService;

@RestController
@RequestMapping("/authenticate")
public class AuthenticationController {

    @Autowired
    private AuthService authService;

    @PostMapping
    public ResponseEntity<?> authenticate(@RequestBody User user) {
        String jwt = authService.authenticate(user.getEmail(), user.getPassword());

        if (jwt != null) {
            return ResponseEntity.ok().header("Authorization", "Bearer " + jwt).build();
        } else {
            return ResponseEntity.status(401).body("Authentication failed"); // Trate os erros de autenticação de maneira adequada
        }
    }
}
