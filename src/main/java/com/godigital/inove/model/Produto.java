package com.godigital.inove.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal valor;
    private int duracaoHoras;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void setId(Long id) {
    }

    // Getters e Setters (Omissos para brevidade)
}
