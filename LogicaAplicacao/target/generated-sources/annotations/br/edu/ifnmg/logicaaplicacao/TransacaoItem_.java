package br.edu.ifnmg.logicaaplicacao;

import br.edu.ifnmg.logicaaplicacao.Produto;
import br.edu.ifnmg.logicaaplicacao.Transacao;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-02-25T19:37:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(TransacaoItem.class)
public class TransacaoItem_ { 

    public static volatile SingularAttribute<TransacaoItem, Transacao> transacao;
    public static volatile SingularAttribute<TransacaoItem, Produto> produto;
    public static volatile SingularAttribute<TransacaoItem, Integer> quantidade;
    public static volatile SingularAttribute<TransacaoItem, BigDecimal> valorUnitario;

}