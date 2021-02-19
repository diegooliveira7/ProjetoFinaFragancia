/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao;

import br.edu.ifnmg.logicaaplicacao.Cliente;
import br.edu.ifnmg.logicaaplicacao.ClienteRepositorio;
import br.edu.ifnmg.logicaaplicacao.Produto;
import br.edu.ifnmg.logicaaplicacao.ProdutoRepositorio;
import br.edu.ifnmg.logicaaplicacao.Transacao;
import br.edu.ifnmg.logicaaplicacao.TransacaoItem;
import br.edu.ifnmg.logicaaplicacao.TransacaoRepositorio;
import br.edu.ifnmg.logicaaplicacao.TransacaoTipo;
import br.edu.ifnmg.logicaaplicacao.Usuario;
import br.edu.ifnmg.logicaaplicacao.UsuarioRepositorio;
import br.edu.ifnmg.persistencia.ClienteDAO;
import br.edu.ifnmg.persistencia.ProdutoDAO;
import br.edu.ifnmg.persistencia.TransacaoDAO;
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
//        }
//        ClienteRepositorio repo = new ClienteDAO();
//        Cliente c = new Cliente();
//        c.setCpf("123455");
//        c.setSexo(Sexo.Homem);
//        c.setNome("Carlos");
//        
//        if(repo.Salvar(c)){
//            System.out.println("Sucesso");
//        }else{
//            System.out.println("Falhou");
//        }
    
//        ClienteRepositorio repo = new ClienteDAO();
//        Cliente c = new Cliente();
//        c.setCpf("123455");
//        c.setSexo(Sexo.Homem);
//        c.setNome("Carlos");
//        
//        if(repo.Salvar(c)){
//            System.out.println("Sucesso");
//        }else{
//            System.out.println("Falhou");
//        }
        
        ProdutoRepositorio repo = new ProdutoDAO();
        Produto pa = repo.Abrir(101L);
        Produto pb = repo.Abrir(151L);
        
        ClienteRepositorio repoC = new ClienteDAO();
        Cliente c = repoC.Abrir(1L);
        
        UsuarioRepositorio repoU = new UsuarioDAO();
        Usuario u = repoU.Abrir(201L);
        
        TransacaoRepositorio repoT = new TransacaoDAO();
        Transacao t = new Transacao(c,TransacaoTipo.Venda,u);
        
        TransacaoItem ti = new TransacaoItem(pa,10,t);
        TransacaoItem te = new TransacaoItem(pb,10,t);
        
        t.add(ti);
        t.add(te);
        
        repoT.Salvar(t);
        
    }
   
    
    
  }
   
    

