package com.example.desplieguesalon;

import com.example.desplieguesalon.entity.Cliente;
import com.example.desplieguesalon.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DespliegueSalonApplication implements CommandLineRunner {

        @Autowired
        private ClienteService clienteService;

        public static void main(String[] args) {
            SpringApplication.run(DespliegueSalonApplication.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
            // Agrega clientes al iniciar la aplicación
            clienteService.agregarCliente(new Cliente(1, "Jhoan Esteban", "Pérez", "1990-01-01"));
            clienteService.agregarCliente(new Cliente(2, "María", "López", "1985-05-15"));
            // Agrega más clientes según sea necesario
        }
}
