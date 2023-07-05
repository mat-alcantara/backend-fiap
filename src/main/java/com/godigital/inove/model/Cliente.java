package com.meuapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String sobrenome;
    private String endereco;
    private String cidade;
    private String estado;
    private String uf;
    private String telefone;
    private String origem;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters e Setters (Omissos para brevidade)
}
