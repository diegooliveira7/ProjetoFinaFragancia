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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/**
 *
 * @author larisse
 */
@Entity
@Table(name="Produtos")
@SecondaryTable(name= "estoque")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    
    @Column(nullable = false, length = 250)
    private String descricao;
    
    @Column(precision = 8, scale = 2)
    private BigDecimal valor_unitario;
    
    @Column(nullable = false, table="estoque")
    private int estoque;

    public Produto() {
        this.id = 0L;
        this.nome = "";
        this.descricao = "";
        this.valor_unitario =  new BigDecimal("0.00");
        this.estoque = estoque;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor_unitario;
    }

    public void setValor(BigDecimal valor) {
        this.valor_unitario = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    
    public void setEstoqueT(int estoque, int verificacao) {
        if(verificacao == 1){
            this.estoque = estoque + this.estoque;
        }
        if(verificacao == 2){
            this.estoque = this.estoque - estoque;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.valor_unitario);
        hash = 97 * hash + this.estoque;
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
        final Produto other = (Produto) obj;
        if (this.estoque != other.estoque) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.valor_unitario, other.valor_unitario)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.descricao;
    }
    
}
