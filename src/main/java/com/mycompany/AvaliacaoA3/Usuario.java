/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AvaliacaoA3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eidisato
 */
public class Usuario {
    private int id_usuario;
    private String nome_usuario, senha_usuario;
    private boolean is_admin;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }
    
    public List<Usuario> auth() {
    ConnectionFactory factory = new ConnectionFactory();
    String sql = "SELECT * FROM tb_usuario WHERE nome_usuario = ? AND senha_usuario = ?";
    try (Connection c = factory.obtemConexao();
         PreparedStatement ps = c.prepareStatement(sql)) {

        ps.setString(1, nome_usuario);
        ps.setString(2, senha_usuario);

        ResultSet rs = ps.executeQuery();

        List<Usuario> usuarios = new ArrayList<>();
        while (rs.next()) {
            Usuario usuario = new Usuario();
            // Preencha os atributos do objeto 'usuario' com os dados do ResultSet
            usuario.setNome_usuario(rs.getString("nome_usuario"));
            usuario.setSenha_usuario(rs.getString("senha_usuario"));
             usuario.setIs_admin(rs.getBoolean("is_admin"));
            usuarios.add(usuario);
        }

        return usuarios;
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao fazer login: " + erro.getMessage());
        return null;
    }
}
    
    public void cadastroUsuario(){
        String sql = "INSERT INTO tb_usuario(nome_usuario, senha_usuario, is_admin) VALUES (?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory(); 
        try (Connection c = factory.obtemConexao()){ 
            PreparedStatement ps = c.prepareStatement(sql); 
            ps.setString(1, nome_usuario); 
            ps.setString(2, senha_usuario); 
            ps.setBoolean(3,false); 
            ps.execute(); 
        }   catch (Exception e){ 
                e.printStackTrace(); 
            }
    }
}

