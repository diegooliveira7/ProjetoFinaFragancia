package br.edu.ifnmg.logicaaplicacao;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-02-18T02:23:13", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Pessoa_ {

    public static volatile SingularAttribute<Cliente, String> telefone;
    public static volatile SingularAttribute<Cliente, Integer> numero;
    public static volatile SingularAttribute<Cliente, String> bairro;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, Integer> version;
    public static volatile SingularAttribute<Cliente, String> rua;

}