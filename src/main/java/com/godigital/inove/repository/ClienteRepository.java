package com.godigital.inove.repository;

import com.godigital.inove.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // As operações CRUD já estão incluídas na interface JpaRepository.
}
