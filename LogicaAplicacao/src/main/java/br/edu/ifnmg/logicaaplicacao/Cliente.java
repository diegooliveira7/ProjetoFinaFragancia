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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author larisse
 */
@Entity
@Table(name = "Cliente")
@DiscriminatorValue(value = "1")
public class Cliente extends Pessoa implements Serializable {

 
    
    @Column(nullable = false, length = 12, unique = true)
    private String cpf;
    
    @Column(nullable = false, length = 250)
    private String rua;
    
    @Column(nullable = false)
    private int numero;
    
    @Column(nullable = false, length = 250)
    private String bairro;
    
    @Column(nullable = false, length = 11)
    private String telefone;
    
    @Version
    private int version;
    
    

    public Cliente() {
        super();
        this.cpf = "";
        this.setNome(nome);
        this.setTipo(PessoaTipo.Cliente);
        this.rua = "";
        this.numero = 0;
        this.bairro = "";
        this.telefone = "";
        this.version = 1;
        
    }

    public Cliente(Long id, String cpf, String rua, int numero, String bairro, String telefone, int version) {
        super();
        this.cpf = cpf;
        this.setNome(nome);
        this.setTipo(PessoaTipo.Cliente);
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.telefone = telefone;
        this.version = version;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        hash = 43 * hash + Objects.hashCode(this.cpf);
        hash = 43 * hash + Objects.hashCode(this.rua);
        hash = 43 * hash + this.numero;
        hash = 43 * hash + Objects.hashCode(this.bairro);
        hash = 43 * hash + Objects.hashCode(this.telefone);
        hash = 43 * hash + this.version;
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
        final Cliente other = (Cliente) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.version != other.version) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
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
        return this.cpf;
    }

   
}
