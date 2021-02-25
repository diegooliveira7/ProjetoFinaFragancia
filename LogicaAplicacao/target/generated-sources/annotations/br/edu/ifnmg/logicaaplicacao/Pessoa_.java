package br.edu.ifnmg.logicaaplicacao;

import br.edu.ifnmg.logicaaplicacao.PessoaTipo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-02-25T10:54:23", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, PessoaTipo> tipo;
    public static volatile SingularAttribute<Pessoa, String> telefone;
    public static volatile SingularAttribute<Pessoa, String> endereco;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, String> email;

}