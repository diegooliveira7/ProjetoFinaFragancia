/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logicaaplicacao;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class RepositorioFactory {
    
    private static Properties propriedades = new Properties();
    private static UsuarioRepositorio usuario;
    private static PessoaRepositorio pessoa;
    private static TransacaoRepositorio transacao;
    private static ClienteRepositorio cliente;
    private static FornecedorRepositorio fornecedor;
    private static ProdutoRepositorio produto;
    
    static{
        FileReader leitorArquivo = null;
            
            try {
                // TODO code application logic here
                
                File arquivoPropriedades = new File("config.properties");
                leitorArquivo = new FileReader(arquivoPropriedades);
                
                propriedades.load(leitorArquivo);
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    leitorArquivo.close();
                } catch (IOException ex) {
                    Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    private static Object getInstancia(String nomeclasse){
        try {    
            Class classe = Class.forName(nomeclasse);
            Object instancia = classe.getDeclaredConstructor().newInstance();
            return instancia;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static UsuarioRepositorio getUsuarioRepositorio(){
        if(usuario == null){
            String nomeclasse = propriedades.getProperty("UsuarioRepositorio");
            usuario = (UsuarioRepositorio) getInstancia(nomeclasse);
        }
        return usuario;
    }
    
    public static PessoaRepositorio getPessoaRepositorio(){
        if(pessoa == null){
            String nomeclasse = propriedades.getProperty("PessoaRepositorio");
            pessoa = (PessoaRepositorio) getInstancia(nomeclasse);
        }
        return pessoa;
    }
    
    public static ClienteRepositorio getClienteRepositorio(){
        if(cliente == null){
            String nomeclasse = propriedades.getProperty("ClienteRepositorio");
            cliente = (ClienteRepositorio) getInstancia(nomeclasse);
        }
        return cliente;
    }
    
    public static FornecedorRepositorio getFornecedorRepositorio(){
        if(fornecedor == null){
            String nomeclasse = propriedades.getProperty("FornecedorRepositorio");
            fornecedor = (FornecedorRepositorio) getInstancia(nomeclasse);
        }
        return fornecedor;
    }
    
    public static ProdutoRepositorio getProdutoRepositorio(){
        if(produto == null){
            String nomeclasse = propriedades.getProperty("ProdutoRepositorio");
            produto = (ProdutoRepositorio) getInstancia(nomeclasse);
        }
        return produto;
    }
    
    public static TransacaoRepositorio getTransacaoRepositorio(){
        if(transacao == null){
            String nomeclasse = propriedades.getProperty("TransacaoRepositorio");
            transacao = (TransacaoRepositorio) getInstancia(nomeclasse);
        }
        return transacao;
    }
}


