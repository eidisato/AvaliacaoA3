package com.mycompany.AvaliacaoA3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pessoa {

    private int id;
    private String nome;
    private String fone;
    private String email;

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public void inserir (){ 
 //1: Definir o comando SQL 
 String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";  //2: Abrir uma conexão 
 ConnectionFactory factory = new ConnectionFactory(); 
 try (Connection c = factory.obtemConexao()){ 
 //3: Pré compila o comando 
 PreparedStatement ps = c.prepareStatement(sql); 
 //4: Preenche os dados faltantes 
 ps.setString(1, nome); 
 ps.setString(2, fone); 
 ps.setString(3, email); 
 //5: Executa o comando 
 ps.execute(); 
 } 
 catch (Exception e){ 
 e.printStackTrace(); 
 } 
 }

     
 public void atualizar (){ 
 //1: Definir o comando SQL 
 String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE  id = ?"; 
 //2: Abrir uma conexão 
 ConnectionFactory factory = new ConnectionFactory(); 
 try (Connection c = factory.obtemConexao()){ 
 //3: Pré compila o comando 
 PreparedStatement ps = c.prepareStatement(sql); 
 //4: Preenche os dados faltantes 
 ps.setString(1, nome); 
 ps.setString(2, fone); 
 ps.setString(3, email); 
 ps.setInt(4, id); 
 //5: Executa o comando 
 ps.execute(); 
  
 } 
 catch (Exception e){ 
 e.printStackTrace(); 
 } 
 }

 
  public void apagar (){ 
 //1: Definir o comando SQL 
 String sql = "DELETE FROM tb_pessoa WHERE id = ?";  //2: Abrir uma conexão 
 ConnectionFactory factory = new ConnectionFactory(); 
 try (Connection c = factory.obtemConexao()){ 
 //3: Pré compila o comando 
 PreparedStatement ps = c.prepareStatement(sql); 
 //4: Preenche os dados faltantes 
 ps.setInt(1, id); 
 //5: Executa o comando 
 ps.execute(); 
 } 
 catch (Exception e){ 
 e.printStackTrace(); 
 } 
}

  
public void listar (){ 
 //1: Definir o comando SQL 
 
 
 String sql = "SELECT * FROM tb_pessoa"; 
 //2: Abrir uma conexão 
 ConnectionFactory factory = new ConnectionFactory(); 
 try (Connection c = factory.obtemConexao()){ 
 //3: Pré compila o comando 
 PreparedStatement ps = c.prepareStatement(sql); 
 //4: Executa o comando e guarda 
 //o resultado em um ResultSet 
 ResultSet rs = ps.executeQuery(); 
 //5: itera sobre o resultado 

  String list= "";
 
 while (rs.next()){ 
 int id = rs.getInt("id"); 
 String nome = rs.getString("nome"); 
 String fone = rs.getString("fone"); 
 String email = rs.getString("email"); 
 String aux = String.format( 
 "Código: %d, Nome: %s, Fone: %s, Email: %s", 
 id, 
 nome, 
 fone, 
 email 
 ); 
 //JOptionPane.showMessageDialog (null, aux); 
 

 list = list + aux + "\n";

 }

 JOptionPane.showMessageDialog (null, list); 
 
 } 
 catch (Exception e){ 
 e.printStackTrace();
 } 



     
 }     
    
}
