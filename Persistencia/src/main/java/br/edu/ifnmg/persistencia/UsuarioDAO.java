/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaaplicacao.Usuario;
import br.edu.ifnmg.logicaaplicacao.UsuarioRepositorio;
import java.util.List;

/**
 *
 * @author larisse
 */
public class  UsuarioDAO extends DataAccessObject<Usuario> implements UsuarioRepositorio{

    public UsuarioDAO() {
        super(Usuario.class);
    }

    
    @Override
    public boolean autenticar(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
