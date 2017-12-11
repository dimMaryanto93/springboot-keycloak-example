package com.maryanto.dimas.example.springboot.keycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/products/list")
    public String listProducts(){
        return "list";
    }
}
