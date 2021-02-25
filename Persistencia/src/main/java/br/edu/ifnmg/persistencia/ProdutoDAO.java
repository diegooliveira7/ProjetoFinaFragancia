/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaaplicacao.Produto;
import br.edu.ifnmg.logicaaplicacao.ProdutoRepositorio;
import java.util.List;
import java.util.HashMap;
import javax.persistence.Query;

/**
 *
 * @author diego
 */
public class ProdutoDAO extends DataAccessObject<Produto> implements ProdutoRepositorio{

        public ProdutoDAO() {
            super(Produto.class);
    }

   
    @Override
    public List<Produto> Buscar(Produto obj) {
        
        String jpql = "select o from Produto o";
        
        if(obj != null){
            jpql = "select pd from Produto pd where pd.id =:parameter";
            Query sql = this.manager.createQuery(jpql);
        
            sql.setParameter("parameter", obj.getId());
            return sql.getResultList();
        }
        Query sql = this.manager.createQuery(jpql);        
        return sql.getResultList();
            
    }

    @Override
    public boolean Apagar(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
