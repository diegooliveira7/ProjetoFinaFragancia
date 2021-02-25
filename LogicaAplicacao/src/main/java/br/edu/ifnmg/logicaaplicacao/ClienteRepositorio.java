/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logicaaplicacao;

import java.util.List;

/**
 *
 * @author larisse
 */
public interface ClienteRepositorio extends Repositorio<Cliente>{
    public List<Cliente> ClienteNome(String nome);
}
