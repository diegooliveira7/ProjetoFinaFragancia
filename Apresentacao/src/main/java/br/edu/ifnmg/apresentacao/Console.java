/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao;

import br.edu.ifnmg.logicaaplicacao.Fornecedor;
import br.edu.ifnmg.logicaaplicacao.FornecedorRepositorio;
import br.edu.ifnmg.logicaaplicacao.RepositorioFactory;

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
            
//            ClienteRepositorio repo = RepositorioFactory.getClienteRepositorio();
//            Cliente t = repo.Abrir(1L);
//            System.out.println(t.getCpf());
//            System.out.println(t.getId());
//            List<Cliente> list = repo.Buscar(t);
//            for(Cliente c: list){
//                System.out.println(c.getCpf());
//            }

                    
//            FornecedorRepositorio repo = RepositorioFactory.getFornecedorRepositorio();
//            Fornecedor f = repo.Abrir(351L);
//            List<Fornecedor> list = repo.Buscar(f);
//            for(Fornecedor c: list){
//                System.out.println(c.getCnpj());
//            }
            
//            PessoaRepositorio repo = RepositorioFactory.getPessoaRepositorio();
//            Pessoa f = repo.Abrir(351L);
//            System.out.println(f.getNome());
            FornecedorRepositorio repo = RepositorioFactory.getFornecedorRepositorio();
            Fornecedor f = repo.Abrir(351L);
            System.out.println(f.getCnpj());
//            System.out.println(repo.Abrir(301L).getLogin());
//            
//            TransacaoRepositorio repoT = RepositorioFactory.getTransacaoRepositorio();
//            System.out.println(repoT.Abrir(251L).getValorTotal());
    }
   
    
    
  }
   
    

