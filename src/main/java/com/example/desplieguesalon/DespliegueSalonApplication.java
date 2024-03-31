package com.example.desplieguesalon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DespliegueSalonApplication {


    @GetMapping("/mensaje")
    public String mensaje(){
        return "Bienvenido juancho";
    }
    public static void main(String[] args) {
        SpringApplication.run(DespliegueSalonApplication.class, args);
    }

}
