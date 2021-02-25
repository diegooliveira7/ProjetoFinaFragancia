package br.edu.ifnmg.logicaaplicacao;

import br.edu.ifnmg.logicaaplicacao.Pessoa;
import br.edu.ifnmg.logicaaplicacao.TransacaoItem;
import br.edu.ifnmg.logicaaplicacao.TransacaoTipo;
import br.edu.ifnmg.logicaaplicacao.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-02-25T19:37:06", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Transacao.class)
public class Transacao_ { 

    public static volatile ListAttribute<Transacao, TransacaoItem> itens;
    public static volatile SingularAttribute<Transacao, TransacaoTipo> tipo;
    public static volatile SingularAttribute<Transacao, Pessoa> pessoa;
    public static volatile SingularAttribute<Transacao, BigDecimal> valorTotal;
    public static volatile SingularAttribute<Transacao, Usuario> usuario;
    public static volatile SingularAttribute<Transacao, Long> id;
    public static volatile SingularAttribute<Transacao, Date> criacao;
    public static volatile SingularAttribute<Transacao, Long> version;

}