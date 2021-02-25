/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logicaaplicacao;

/**
 *
 * @author larisse
 */
public interface UsuarioRepositorio extends Repositorio<Usuario> {
    
    public Usuario autenticar(String login, String senha);
    
}
