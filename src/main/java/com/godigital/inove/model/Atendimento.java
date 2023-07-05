package com.godigital.inove.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "atendimentos")
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Long idCliente;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataFinalizacao;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters e Setters (Omissos para brevidade)
}
