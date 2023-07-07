package com.godigital.inove.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class GenerateJWT {

    private final String jwtSecret = "my-very-secure-secret"; // Secret deve ser segura e complexa na realidade

    public String createJWT(String subject) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + 86400000); // Expira em 24 horas

        return Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }
}
