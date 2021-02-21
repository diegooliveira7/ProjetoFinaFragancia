/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logicaaplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "transacaoitens")
public class TransacaoItem implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "transacao_id", nullable = false)
    private Transacao transacao;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;
    
    private int quantidade;

    @Column(precision = 8, scale = 2)
    private BigDecimal valorUnitario;

    public TransacaoItem() {
        this.produto = null;
        this.transacao = null;
        this.quantidade = 0;
        this.valorUnitario = new BigDecimal("0.00");
    }
    
    public TransacaoItem(Produto produto, int quantidade, Transacao transacao) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.transacao = transacao;
        this.valorUnitario = produto.getValor();
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.transacao);
        hash = 59 * hash + Objects.hashCode(this.produto);
        hash = 59 * hash + this.quantidade;
        hash = 59 * hash + Objects.hashCode(this.valorUnitario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TransacaoItem other = (TransacaoItem) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.transacao, other.transacao)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.valorUnitario, other.valorUnitario)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.produto.toString();
    }
    
}
