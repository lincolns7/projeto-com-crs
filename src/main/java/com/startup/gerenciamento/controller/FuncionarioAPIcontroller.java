/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.startup.gerenciamento.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Aluno
 */
@RestController
@RequestMapping("/api")
public class FuncionarioAPIcontroller {
    
    @GetMapping("/ola")
    public String ola(){
        return "OLá mundo,esta é a minha primeira rota de api";
    }
    @GetMapping("/nome")
    public String nome(){
        return "Lincoln Scherrer de Moraes Rocha";
    }
    @GetMapping("/dados")
    public String dados(){
        return "Lincoln Scherrer de Moraes Rocha - 16 anos - DS";
    }
    
}
