/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaaplicacao.Pessoa;
import br.edu.ifnmg.logicaaplicacao.PessoaRepositorio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class PessoaDAO extends DataAccessObject<Pessoa> implements PessoaRepositorio {

     public PessoaDAO(){
        
        super(Pessoa.class);
    }

    @Override
    public List<Pessoa> Buscar(Pessoa obj) {
        String jpql = "select o from Pessoa o";
        
        if(obj != null){
            jpql = "select pd from Pessoa pd where pd.id =:parameter";
            Query sql = this.manager.createQuery(jpql);
        
            sql.setParameter("parameter", obj.getId());
            return sql.getResultList();
        }
        Query sql = this.manager.createQuery(jpql);        
        return sql.getResultList();
    }

    @Override
    public boolean Apagar(Pessoa obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
}
