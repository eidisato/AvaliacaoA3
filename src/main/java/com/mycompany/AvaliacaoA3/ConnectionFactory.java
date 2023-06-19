package com.mycompany.AvaliacaoA3;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
   
 private String usuario = "root"; 
 private String senha = "root"; 
 private String host = "localhost"; 
 private String porta = "3306"; 
 private String bd = "db_a3"; 
  
 public Connection obtemConexao (){ 
 try{ 
 Connection c = DriverManager.getConnection( 
 "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC", 
 usuario, 
 senha 
 ); 
 
 return c; 
 } 
 catch (Exception e){ 
 e.printStackTrace(); 
 return null; 
 } 
 } 

}

