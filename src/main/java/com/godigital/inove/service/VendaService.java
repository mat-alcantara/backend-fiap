package com.godigital.inove.service;

import com.godigital.inove.model.Venda;
import com.godigital.inove.repository.VendaRepository;
import com.godigital.inove.repository.ClienteRepository;
import com.godigital.inove.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    private final VendaRepository vendaRepository;
    private final ClienteRepository clienteRepository; // Adicionado
    private final ProdutoRepository produtoRepository; // Adicionado

    @Autowired
    public VendaService(VendaRepository vendaRepository, ClienteRepository clienteRepository, ProdutoRepository produtoRepository) {
        this.vendaRepository = vendaRepository;
        this.clienteRepository = clienteRepository; // Inicializado
        this.produtoRepository = produtoRepository; // Inicializado
    }

    public List<Venda> findAll() {
        return vendaRepository.findAll();
    }

    public Optional<Venda> findById(Long id) {
        return vendaRepository.findById(id);
    }

    public Venda save(Venda venda) throws Exception {
        // Verificando se o cliente e o produto existem
        if (!clienteRepository.existsById(venda.getIdCliente())) {
            throw new Exception("Cliente com o ID " + venda.getIdCliente() + " não encontrado.");
        }

        if (!produtoRepository.existsById(venda.getIdProduto())) {
            throw new Exception("Produto com o ID " + venda.getIdProduto() + " não encontrado.");
        }

        return vendaRepository.save(venda);
    }

    public void deleteById(Long id) {
        vendaRepository.deleteById(id);
    }
}
