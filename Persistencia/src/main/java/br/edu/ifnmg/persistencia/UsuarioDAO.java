/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaaplicacao.Usuario;
import br.edu.ifnmg.logicaaplicacao.UsuarioRepositorio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author larisse
 */
public class  UsuarioDAO extends DataAccessObject<Usuario> implements UsuarioRepositorio{

    public UsuarioDAO() {
        super(Usuario.class);
    }

    
    @Override
    public Usuario autenticar(String login, String senha) {
        Query sql =  this.manager.createQuery("select o from Usuario o where o.login = :login and o.senha = :senha");
        sql.setParameter("login", login);
        sql.setParameter("senha", senha);
        
        if(sql.getResultList().size() > 0)
            return (Usuario) sql.getSingleResult();
        
        return null;
    }

    @Override
    public List<Usuario> Buscar(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Apagar(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
