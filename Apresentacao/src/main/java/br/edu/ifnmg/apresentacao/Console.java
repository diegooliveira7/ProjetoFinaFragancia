/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao;

import br.edu.ifnmg.logicaaplicacao.RepositorioFactory;
import br.edu.ifnmg.logicaaplicacao.TransacaoRepositorio;
import br.edu.ifnmg.logicaaplicacao.UsuarioRepositorio;

/**
 *
 * @author larisse
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            UsuarioRepositorio repo = RepositorioFactory.getUsusarioRepositorio();
            System.out.println(repo.Abrir(301L).getLogin());
            
            TransacaoRepositorio repoT = RepositorioFactory.getTransacaoRepositorio();
            System.out.println(repoT.Abrir(251L).getValorTotal());
    }
   
    
    
  }
   
    

