/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.startup.gerenciamento.controller;

import com.startup.gerenciamento.model.FuncionarioBean;
import com.startup.gerenciamento.repository.FuncionarioDAO;
import com.startup.gerenciamento.service.FuncionarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {
    
    @Autowired
    private FuncionarioService service;
    
    @GetMapping("/funcionarios")
    public String getFuncionarios(Model model) {
        List<FuncionarioBean> lista = service.lerTodos();
        model.addAttribute("lista",lista);
        return "funcionarios";
    }
    @Controller
public class PerfilController {

    @GetMapping("/perfil")
    public String perfil(@RequestParam int id, Model model) {
        FuncionarioBean funcionario = service.lerPorId(id);
        model.addAttribute("funcionario", funcionario);
        return "perfil";
    }
}
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute FuncionarioBean funcionarios) {
        service.save(funcionarios);
        return "redirect:/funcionarios";
    }
}
