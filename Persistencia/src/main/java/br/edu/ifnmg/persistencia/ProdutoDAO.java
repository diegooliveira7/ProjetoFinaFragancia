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
        
        // Consulta JPQL padrão
        String jpql = "select o from Usuario o";
        
        // Dicionário de parâmetros
        HashMap<String, Object> parametros = new HashMap<>();
        
        // Verifico quais os valores que existem no obj
        if(obj != null){
            if(obj.getNome() != null & !obj.getNome().isEmpty())
                parametros.put("nome", obj.getNome());
            if(obj.getId() > 0)
                parametros.put("id", obj.getId());
        }
        
        // Crio a parte da JPQL que contém os filtros
        if(!parametros.isEmpty()){
            String filtros = "";
            jpql += " where ";
            for(String campo : parametros.keySet()){
                if(!filtros.isEmpty())
                    filtros += " and ";
                jpql += "o." + campo + " = :" + campo;
            }
            jpql += filtros;
        }
        
        Query sql = this.manager.createQuery(jpql);
        
        if(!parametros.isEmpty())
            for(String campo : parametros.keySet())
                sql.setParameter(campo, parametros.get(campo));
            
        
        return sql.getResultList();
            
    }

    @Override
    public boolean Apagar(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
