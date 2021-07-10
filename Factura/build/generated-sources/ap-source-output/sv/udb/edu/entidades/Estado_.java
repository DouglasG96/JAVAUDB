package sv.udb.edu.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.udb.edu.entidades.Empleado;
import sv.udb.edu.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-07-10T14:30:15")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> descripcion;
    public static volatile SingularAttribute<Estado, Integer> idEstado;
    public static volatile CollectionAttribute<Estado, Empleado> empleadoCollection;
    public static volatile CollectionAttribute<Estado, Usuario> usuarioCollection;

}