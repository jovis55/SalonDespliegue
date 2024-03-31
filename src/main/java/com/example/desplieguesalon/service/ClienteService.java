package com.example.desplieguesalon.service;

import com.example.desplieguesalon.entity.Cliente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final List<Cliente> clientes = new ArrayList<>();
    private int proximoId = 1;

    public void agregarCliente(Cliente cliente) {
        cliente.setId(proximoId++);
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public Cliente obtenerClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }
}