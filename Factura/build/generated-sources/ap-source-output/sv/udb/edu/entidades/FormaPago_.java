package sv.udb.edu.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.udb.edu.entidades.Factura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T14:30:15")
@StaticMetamodel(FormaPago.class)
public class FormaPago_ { 

    public static volatile SingularAttribute<FormaPago, String> descripcion;
    public static volatile SingularAttribute<FormaPago, Integer> idFormaPago;
    public static volatile CollectionAttribute<FormaPago, Factura> facturaCollection;

}