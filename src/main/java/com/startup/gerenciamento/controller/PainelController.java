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

/**
 *
 * @author Aluno
 */
@Controller
public class PainelController {
    FuncionarioDAO d = new FuncionarioDAO();
    
    @GetMapping("/funcionarios")
    public String funcionarios(Model model){
        List<FuncionarioBean> lista = d.listarfuncionarios();
        model.addAttribute("lista",lista);
        return "funcionarios";
    }
    
    @GetMapping("/painel")
    public String painel(Model model){
        int lista = d.numFuncionarios();
        model.addAttribute("total",lista);
        return "painel";
    }
}
