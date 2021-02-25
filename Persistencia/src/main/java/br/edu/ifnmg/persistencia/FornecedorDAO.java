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
    public List<Fornecedor> Buscar(Fornecedor obj) {
        
        String jpql = "select for from Fornecedor for";
        //String filtros = "";
        HashMap<String, Object> parametros = new HashMap<>();
        
            if(obj != null){

                if(obj.getNome() != null & !obj.getNome().isEmpty())
                    parametros.put("nome", obj.getNome());
                if(obj.getId()> 0)
                    parametros.put("id", obj.getId());
            }
            
//            if(obj.getTelefone().length() > 0){
//                String filtros = "";
//                filtros += "for.telefone like :telefone";
//                parametros.put("telefone", obj.getTelefone() + "%");
//            }
            
             if(obj.getCnpj().length() > 0){
                String filtros = "";
                filtros += "for.cpf like :cnpj";
                parametros.put("cnpj", obj.getCnpj() + "%");
            }
             
            if(!parametros.isEmpty()){
                String filtros = "";
                jpql += " where ";
                for(String campo : parametros.keySet()){
                    if(!filtros.isEmpty())
                        filtros += " and ";
                    jpql += "for." + campo + " =:" + campo;
                }
                jpql += filtros;
            }

            
            
            Query sql = this.manager.createQuery(jpql);
            
            
            if(!parametros.isEmpty())
                for(String campo: parametros.keySet())
                    sql.setParameter(campo, parametros.get(campo));
            
            return sql.getResultList();
           
           
            
    }    

    @Override
    public boolean Apagar(Fornecedor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
