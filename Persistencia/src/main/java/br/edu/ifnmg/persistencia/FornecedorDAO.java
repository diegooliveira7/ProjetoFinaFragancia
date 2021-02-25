/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;


import br.edu.ifnmg.logicaaplicacao.Fornecedor;
import br.edu.ifnmg.logicaaplicacao.FornecedorRepositorio;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class FornecedorDAO extends DataAccessObject<Fornecedor> implements FornecedorRepositorio {
    
     public FornecedorDAO() {
        super(FornecedorDAO.class);
    }

       @Override
    public List<Fornecedor> Buscar(Fornecedor obg) {
        
        String jpql = "select o from Fornecedor o";
        
        if(obg != null){
            jpql = "select pd from Fornecedor pd where pd.id =:parameter";
            Query sql = this.manager.createQuery(jpql);
        
            sql.setParameter("parameter", obg.getId());
            return sql.getResultList();
        }
        Query sql = this.manager.createQuery(jpql);        
        return sql.getResultList();
    }    

    @Override
    public boolean Apagar(Fornecedor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
