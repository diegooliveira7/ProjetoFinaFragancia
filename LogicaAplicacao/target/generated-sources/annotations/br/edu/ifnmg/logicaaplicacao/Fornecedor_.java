package br.edu.ifnmg.logicaaplicacao;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-02-17T20:49:52", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ extends Pessoa_ {

    public static volatile SingularAttribute<Fornecedor, String> telefone;
    public static volatile SingularAttribute<Fornecedor, Integer> numero;
    public static volatile SingularAttribute<Fornecedor, String> bairro;
    public static volatile SingularAttribute<Fornecedor, String> cnpj;
    public static volatile SingularAttribute<Fornecedor, Integer> version;
    public static volatile SingularAttribute<Fornecedor, String> rua;

}