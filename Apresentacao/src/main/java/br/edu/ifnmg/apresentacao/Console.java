/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao;

import br.edu.ifnmg.logicaaplicacao.Cliente;
import br.edu.ifnmg.logicaaplicacao.ClienteRepositorio;
import br.edu.ifnmg.logicaaplicacao.RepositorioFactory;
import br.edu.ifnmg.logicaaplicacao.TransacaoRepositorio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author larisse
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//            UsuarioRepositorio repo = RepositorioFactory.getUsuarioRepositorio();
//            System.out.println(repo.Abrir(301L).getLogin());
            
            ClienteRepositorio repo = RepositorioFactory.getClienteRepositorio();
            Cliente t = repo.Abrir(1L);
            System.out.println(t.getCpf());
            System.out.println(t.getId());
            List<Cliente> list = repo.Buscar(t);
            for(Cliente c: list){
                System.out.println(c.getCpf());
            }
//            System.out.println(repo.Abrir(301L).getLogin());
//            
//            TransacaoRepositorio repoT = RepositorioFactory.getTransacaoRepositorio();
//            System.out.println(repoT.Abrir(251L).getValorTotal());
    }
   
    
    
  }
   
    

