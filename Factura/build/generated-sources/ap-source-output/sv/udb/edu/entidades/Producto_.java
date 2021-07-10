package sv.udb.edu.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.udb.edu.entidades.DetalleFactura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T14:30:15")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile CollectionAttribute<Producto, DetalleFactura> detalleFacturaCollection;
    public static volatile SingularAttribute<Producto, BigDecimal> precio;
    public static volatile SingularAttribute<Producto, Integer> idProducto;

}