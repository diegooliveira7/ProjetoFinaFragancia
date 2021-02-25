/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaaplicacao.Repositorio;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author larisse
 */
public abstract class DataAccessObject<T> implements Repositorio<T>{
    
    protected EntityManager manager;
    
    private Class tipo;
    
    public DataAccessObject(Class tipo){
        
        var factory = Persistence.createEntityManagerFactory("UP");
        this.manager = factory.createEntityManager();
        this.tipo = tipo;
    }


    @Override
    public boolean Salvar(T obj) {
       EntityTransaction transacao = this.manager.getTransaction();
       try{
            transacao.begin();
            this.manager.persist(obj);
            transacao.commit();
            
             return true;
       }catch(Exception ex){
           transacao.rollback();
       }
        return false;
    }

    @Override
    public T Abrir(Long id) {
        
        try{
            T obj = (T)this.manager.find(this.tipo, id);
            return obj;
        }catch(Exception ex){
            return null;
        }
        
    }
    
    @Override
    public boolean Apagar(T obg) {
        EntityTransaction transaction = this.manager.getTransaction();
        try{
            transaction.begin();// inicia a transação
            
            this.manager.remove(obg);//faz a transação, nesse caso trocasse o persiste pelo remove
            
            transaction.commit(); // Finalia a transação
            
            return true; 
            
        }catch(Exception exeption){
            transaction.rollback();
            System.out.println("Exceção: " + exeption);
            return false;
        }
    }
    
    @Override
    public abstract List<T> Buscar(T obj);
    
}
