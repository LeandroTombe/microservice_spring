package com.registro.micro1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HolaController2 {

    @Autowired
    RestTemplate plantilla;
    @GetMapping("/hola")
    public String holaCliente() {

        return  plantilla.getForObject("http://micro1/hola", String.class).toUpperCase();
    }
}