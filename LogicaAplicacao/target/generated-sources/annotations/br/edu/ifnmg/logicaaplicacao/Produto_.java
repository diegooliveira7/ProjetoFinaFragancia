package br.edu.ifnmg.logicaaplicacao;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-02-18T14:12:48", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Integer> estoque;
    public static volatile SingularAttribute<Produto, Long> id;
    public static volatile SingularAttribute<Produto, String> descricao;
    public static volatile SingularAttribute<Produto, BigDecimal> valor_unitario;

}