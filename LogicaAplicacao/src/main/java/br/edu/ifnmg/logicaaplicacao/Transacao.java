/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logicaaplicacao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 *
 * @author diego
 */
@Entity
@Table(name="Transacoes")
public class Transacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date criacao;
    
    @Column(precision = 8, scale = 2)
    public BigDecimal valorTotal;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "transacao")
    private List<TransacaoItem> itens;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private TransacaoTipo tipo;
    
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Usuario usuario;
    
    @Version
    private long version;

    public Transacao() {
        this.id = 0L;
        this.pessoa = null;
        this.valorTotal = new BigDecimal("0.00");
        this.criacao = new Date();
        this.itens = new ArrayList<>();
        this.tipo = TransacaoTipo.Venda;
        this.version = 1;
    }

    public Transacao(Pessoa pessoa, TransacaoTipo tipo, Usuario user) {
        this.id = 0L;
        this.pessoa = pessoa;
        this.tipo = tipo;
        this.usuario = user;
        this.version = 1;
        this.criacao = new Date();
        this.itens = new ArrayList<>();
        this.valorTotal = new BigDecimal("0.00");
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<TransacaoItem> getItens() {
        return itens;
    }

    public void setItens(List<TransacaoItem> itens) {
        this.itens = itens;
    }

    public TransacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(TransacaoTipo tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public boolean add(TransacaoItem item){
        item.setTransacao(this);
        if(! this.itens.contains(item)){
            this.itens.add(item);
            this.valorTotal = this.valorTotal.add(
                    item.getValorUnitario().multiply(BigDecimal.valueOf(item.getQuantidade())));
            return true;
        }
        return false;
    }
    
    public boolean remove(TransacaoItem item){
        if(this.itens.contains(item)){
            this.itens.remove(item);
            this.valorTotal = this.valorTotal.subtract(
                    item.getValorUnitario().multiply(BigDecimal.valueOf(item.getQuantidade())));
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.pessoa);
        hash = 89 * hash + Objects.hashCode(this.criacao);
        hash = 89 * hash + Objects.hashCode(this.valorTotal);
        hash = 89 * hash + Objects.hashCode(this.itens);
        hash = 89 * hash + Objects.hashCode(this.tipo);
        hash = 89 * hash + Objects.hashCode(this.usuario);
        hash = 89 * hash + (int) (this.version ^ (this.version >>> 32));
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
        final Transacao other = (Transacao) obj;
        if (this.version != other.version) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        if (!Objects.equals(this.criacao, other.criacao)) {
            return false;
        }
        if (!Objects.equals(this.valorTotal, other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.itens, other.itens)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return id.toString();
    }
    
}
