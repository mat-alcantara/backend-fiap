package com.godigital.inove.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vendas")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "idproduto")
    private Long idProduto;
    @Column(name = "idcliente")
    private Long idCliente;
    @Column(name = "datavenda")
    private LocalDate dataVenda;
    private LocalDateTime createdat;
    private LocalDateTime updatedat;


    public Long getId() {
        return id;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
}
