/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.logicaaplicacao;

import java.io.Serializable;
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

    private static final long serialVersionUID = 1L;
   
    
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
        //this.setTipo(PessoaTipo.Fornecedor);
        this.cnpj = "";
        this.rua = "";
        this.numero = 0;
        this.bairro = "";
        this.telefone = "";
        this.version = 1;
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

   
   
    
}
