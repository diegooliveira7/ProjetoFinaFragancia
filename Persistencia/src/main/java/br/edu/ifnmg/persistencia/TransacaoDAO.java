/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.persistencia;

import br.edu.ifnmg.logicaaplicacao.Transacao;
import br.edu.ifnmg.logicaaplicacao.TransacaoRepositorio;
import java.util.List;

/**
 *
 * @author diego
 */
public class TransacaoDAO extends DataAccessObject<Transacao> implements TransacaoRepositorio{

    public TransacaoDAO() {
        super(Transacao.class);
    }

    @Override
    public List<Transacao> Buscar(Transacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Apagar(Transacao obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
