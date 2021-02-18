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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "Clientes")
@DiscriminatorValue(value = "0")
public class Cliente extends Pessoa implements Serializable {

    @Column(nullable = false, length = 12, unique = true)
    private String cpf;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private Sexo sexo;
    
    @Version
    private int version;
    
    public Cliente() {
        super();
        this.cpf = "";
        this.setTipo(PessoaTipo.Cliente);
        this.sexo = Sexo.Mulher;
        this.version = 1;
    }

    public Cliente(Long id, String nome, String telefone, String email, String cpf, String endereco) {
        super();
        this.cpf = cpf;
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTipo(PessoaTipo.Cliente);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.version = 1;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cpf);
        hash = 79 * hash + Objects.hashCode(this.sexo);
        hash = 79 * hash + this.version;
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
        if (this.version != other.version) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.cpf;
    }
}
