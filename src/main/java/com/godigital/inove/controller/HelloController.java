package com.godigital.inove.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public YourResponseObject hello() {
        YourResponseObject response = new YourResponseObject();
        response.setMessage("hello world!");
        return response;
    }

    // Classe auxiliar para a resposta
    public static class YourResponseObject {
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}