package sv.udb.edu.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.udb.edu.entidades.Cliente;
import sv.udb.edu.entidades.DetalleFactura;
import sv.udb.edu.entidades.Empleado;
import sv.udb.edu.entidades.FormaPago;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T14:30:15")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Date> fecha;
    public static volatile CollectionAttribute<Factura, DetalleFactura> detalleFacturaCollection;
    public static volatile SingularAttribute<Factura, FormaPago> idFormaPago;
    public static volatile SingularAttribute<Factura, Cliente> idCliente;
    public static volatile SingularAttribute<Factura, Empleado> idEmpleado;
    public static volatile SingularAttribute<Factura, Integer> idFactura;

}