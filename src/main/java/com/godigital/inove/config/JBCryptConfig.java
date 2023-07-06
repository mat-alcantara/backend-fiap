package com.godigital.inove.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class JBCryptConfig {

    private static final int BCRYPT_ROUNDS = 10; // Defina o número de rounds desejado

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder(BCRYPT_ROUNDS);
    }
}
