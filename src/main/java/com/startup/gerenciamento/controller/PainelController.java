/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.startup.gerenciamento.controller;

import com.startup.gerenciamento.model.FuncionarioBean;
import com.startup.gerenciamento.repository.FuncionarioDAO;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Aluno
 */
@Controller
public class PainelController {
    FuncionarioDAO d = new FuncionarioDAO();
    
    @GetMapping("/funcionarios")
    public String funcionarios(Model model){
        List<FuncionarioBean> lista = d.lerTodos();
        model.addAttribute("lista",lista);
        return "funcionarios";
    }
    
    @GetMapping("/painel")
    public String perfil(@RequestParam int id, Model model){
        FuncionarioBean func = d.listarFuncionarios();
        model.addAttribute("funcionario",func);
        return "perfil";
    }
}
