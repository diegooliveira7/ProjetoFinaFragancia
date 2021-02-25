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
public interface FornecedorRepositorio extends Repositorio<Fornecedor>{
    public List<Fornecedor> FornecedorNome(String nome);
}
