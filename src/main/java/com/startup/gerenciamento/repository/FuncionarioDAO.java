/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.startup.gerenciamento.repository;

import com.startup.gerenciamento.model.FuncionarioBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Aluno
 */
@Repository
public class FuncionarioDAO {
    
    public List<FuncionarioBean> lerTodos() {
        List<FuncionarioBean> dados = new ArrayList();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("select * from funcionario");
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                FuncionarioBean funcionario = new FuncionarioBean();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setDepartamento(rs.getString("departamento"));
                funcionario.setEmail(rs.getString("email"));
                funcionario.setData_contratacao(rs.getDate("data_contratacao"));
                dados.add(funcionario);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return dados;
    }
    public int listarFuncionarios(){
        
        int total = 0;
        
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("select count(*) as total FROM funcionario");
            rs = stmt.executeQuery();
            
            if(rs.next()){
                total = rs.getInt("total");
            }
            
        }catch(SQLException e){
         e.printStackTrace();
        }
        return total;
    }

    public List<FuncionarioBean> listarfuncionarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int numFuncionarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}