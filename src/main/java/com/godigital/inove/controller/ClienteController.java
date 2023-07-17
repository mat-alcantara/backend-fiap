package com.godigital.inove.controller;

import com.godigital.inove.model.Cliente;
import com.godigital.inove.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente read(@PathVariable Long id) {
        return clienteService.findById(id).orElse(null);
    }

    @GetMapping
    public List<Cliente> readAll() {
        return clienteService.findAll();
    }

    @PutMapping
    public Cliente update(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
}
