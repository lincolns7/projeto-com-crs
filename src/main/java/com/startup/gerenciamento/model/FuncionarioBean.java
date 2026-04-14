/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.startup.gerenciamento.model;

import java.sql.Date;

public class FuncionarioBean {
    private int id;
    private String cargo;
    private String nome;
    private String departamento;
    private String email;
    private Date data_contratacao;

    public FuncionarioBean() {
    }

    public FuncionarioBean(int id, String cargo, String nome, String departamento, String email, Date data_contratacao) {
        this.id = id;
        this.cargo = cargo;
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
        this.data_contratacao = data_contratacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }
    
}
