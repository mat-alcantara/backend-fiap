package com.godigital.inove.service;

import com.godigital.inove.config.GenerateJWT;
import com.godigital.inove.model.User;
import com.godigital.inove.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCrypt;


@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository; // Supondo que UserRepository é o seu repositório do usuário

    @Autowired
    private GenerateJWT generateJWT;

    public String authenticate(String email, String password) {
        User user = userRepository.findByEmail(email); // Supondo que findByEmail é um método do seu repositório do usuário

        if (user != null && BCrypt.checkpw(password, user.getPassword())) { // Verifica se o usuário existe e a senha está correta
            return generateJWT.createJWT(user.getId()); // Gera um JWT com o ID do usuário como assunto
        }

        return null; // Retorne null ou lance uma exceção se a autenticação falhar
    }
}
