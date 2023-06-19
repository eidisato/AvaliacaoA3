package com.mycompany.AvaliacaoA3;

import javax.swing.JOptionPane;

public class Principal {

 public static void main(String[] args) { 
     
 String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";  int op; 
 do{ 
 op = Integer.parseInt(JOptionPane.showInputDialog(menu));  switch (op){ 
     case 1:{ 
 String nome = JOptionPane.showInputDialog("Nome?");
 String fone = JOptionPane.showInputDialog("Fone?");  
 String email = JOptionPane.showInputDialog("Email?");  
 Pessoa p = new Pessoa (); 
 p.setNome(nome); 
 p.setFone(fone); 
 p.setEmail(email); 
 p.inserir();


 break; 
}
     
case 2:{ 
    
 String nome = JOptionPane.showInputDialog("Nome?");  
 String fone = JOptionPane.showInputDialog("Fone?");  
 String email = JOptionPane.showInputDialog("Email?");  
 int id = Integer.parseInt(JOptionPane.showInputDialog("Codigo?")); 
 Pessoa p = new Pessoa (); 
 p.setNome(nome); 
 p.setFone(fone); 
 p.setEmail(email); 
 p.setId(id); 
 p.atualizar(); 

    
    
    
    
 break; 
}

case 3:{ 
    
 int id = 
 Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));  
 Pessoa p = new Pessoa (); 
 p.setId(id); 
 p.apagar(); 

    
    
 break; 
 }

case 4:{
    Pessoa p = new Pessoa();
    p.listar();
    break; 
}

  
  case 0: 
 break; 
 default: 
 JOptionPane.showMessageDialog(null, "Opção inválida");  } 
  
 }while (op != 0); 
 } 


    
}
