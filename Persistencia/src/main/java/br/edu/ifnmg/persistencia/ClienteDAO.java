/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaaplicacao.Cliente;
import br.edu.ifnmg.logicaaplicacao.ClienteRepositorio;
import java.util.List;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author larisse
 */
public class ClienteDAO extends DataAccessObject<Cliente> implements ClienteRepositorio {
    
    
    public ClienteDAO(){
        
        super(Cliente.class);
    
    }

    @Override
    public List<Cliente> Buscar(Cliente cliente) {
        
        String jpql = "select o from Cliente o";
        
        if(cliente != null){
            jpql = "select pd from Cliente pd where pd.id =:parameter";
            Query sql = this.manager.createQuery(jpql);
        
            sql.setParameter("parameter", cliente.getId());
            return sql.getResultList();
        }
        Query sql = this.manager.createQuery(jpql);        
        return sql.getResultList();
    }
  
    @Override
    public boolean Apagar(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
