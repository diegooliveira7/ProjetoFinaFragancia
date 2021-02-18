/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao;

import br.edu.ifnmg.logicaaplicacao.Cliente;
import br.edu.ifnmg.logicaaplicacao.ClienteRepositorio;
import br.edu.ifnmg.logicaaplicacao.Sexo;
import br.edu.ifnmg.persistencia.ClienteDAO;

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
        
//        UsuarioRepositorio repo = new UsuarioDAO();
//        
//        Usuario u = new Usuario();
//        u.setLogin("teste");
//        u.setSenha("123");
//        
//        if(repo.Salvar(u)){
//        
//        System.out.println("Sucesso");
//      
//        }else{
//    
//        System.out.println("Falhou");

        ClienteRepositorio repo = new ClienteDAO();
        Cliente c = new Cliente();
        c.setCpf("123455");
        c.setSexo(Sexo.Homem);
        c.setNome("Carlos");
        
        if(repo.Salvar(c)){
            System.out.println("Sucesso");
        }else{
            System.out.println("Falhou");
        }
    
    }
   
    
    
  }
   
    

