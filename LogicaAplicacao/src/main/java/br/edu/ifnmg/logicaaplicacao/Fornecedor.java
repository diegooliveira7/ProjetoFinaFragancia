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
@Table(name = "Fornecedor")
@DiscriminatorValue(value = "2")
public class Fornecedor extends Pessoa implements Serializable {
   
    
    @Column(nullable = false)
    private String cnpj;
    
    @Column(nullable = false)
    private String rua;
    
    @Column(nullable = false)
    private int numero;
    
    @Column(nullable = false)
    private String bairro;
    
    @Column(nullable = false)
    private String telefone;
    
    @Version
    private int version;
    

    public Fornecedor() {
        
        super();
        this.setTipo(PessoaTipo.Fornecedor);
        this.setNome(nome);
        this.cnpj = "";
        this.rua = "";
        this.numero = 0;
        this.bairro = "";
        this.telefone = "";
        this.version = 1;
    }

    public Fornecedor(String cnpj, String rua, int numero, String bairro, String telefone, int version) {
        super();
        this.setTipo(PessoaTipo.Fornecedor);
        this.setNome(nome);
        this.cnpj = cnpj;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.telefone = telefone;
        this.version = version;
    }
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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
        hash = 47 * hash + Objects.hashCode(this.cnpj);
        hash = 47 * hash + Objects.hashCode(this.rua);
        hash = 47 * hash + this.numero;
        hash = 47 * hash + Objects.hashCode(this.bairro);
        hash = 47 * hash + Objects.hashCode(this.telefone);
        hash = 47 * hash + this.version;
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
        if (this.numero != other.numero) {
            return false;
        }
        if (this.version != other.version) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.cnpj;
    }

   
   
    
}
