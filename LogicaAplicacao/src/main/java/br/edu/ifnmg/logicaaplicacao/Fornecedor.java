/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logicaaplicacao;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "Fornecedores")
@DiscriminatorValue(value = "1")
public class Fornecedor extends Pessoa implements Serializable {
   
    @Column(nullable = false)
    private String cnpj;
    
    @Version
    private int version;
    
    public Fornecedor() {
        super();
        this.setTipo(PessoaTipo.Fornecedor);
        this.cnpj = "";
        this.version = 1;
    }

    public Fornecedor(String cnpj, String nome, String telefone) {
        super();
        this.setTipo(PessoaTipo.Fornecedor);
        this.setNome(nome);
        this.cnpj = cnpj;
        this.setTelefone(telefone);
        this.version = 1;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cnpj);
        hash = 97 * hash + this.version;
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.version != other.version) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.cnpj;
    }
    
}
