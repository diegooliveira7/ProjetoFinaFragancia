/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao;

import br.edu.ifnmg.logicaaplicacao.Usuario;
import br.edu.ifnmg.logicaaplicacao.UsuarioRepositorio;
import br.edu.ifnmg.persistencia.UsuarioDAO;

/**
 *
 * @author larisse
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UsuarioRepositorio repo = new UsuarioDAO();
        
        Usuario u = new Usuario();
        u.setLogin("teste");
        u.setSenha("123");
        
        if(repo.Salvar(u)){
        
        System.out.println("Sucesso");
      
        }else{
    
        System.out.println("Falhou");
    
    }
   
    
    
  }
   
    
}
