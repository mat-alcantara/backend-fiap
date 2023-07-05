package com.godigital.inove.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idProduto;
    private Long idCliente;
    private LocalDate dataVenda;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters e Setters (Omissos para brevidade)
}
