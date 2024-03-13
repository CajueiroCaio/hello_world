package com.caioc.caju.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public String bsm() {
        return "BSM´s Generation: Trabalho em equipe, Orientação aos Detalhes, Proatividade, Comunicação, Pesistência" +
                "Responsabilidade pessoal, Orientação ao Futuro, Orientação ao Futuro, Mentalidade de Crescimento";
    }

    @GetMapping("/aprendizagem-semana")
    public String aprendizagem() {
        return "Spring Boot!";
    }
}



