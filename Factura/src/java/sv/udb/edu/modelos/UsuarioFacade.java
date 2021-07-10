/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.modelos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.udb.edu.entidades.Usuario;

/**
 *
 * @author jorge
 */
@javax.ejb.Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "FacturaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario buscarUsuario(String nombre , String clave){
                
        Query q = em.createQuery("SELECT U FROM Usuario U WHERE U.nombre = :usuario AND U.password = :clave AND U.idEstado = 1 ");
        q.setParameter("usuario", nombre );
        q.setParameter("clave" , clave  );
                
        if( q.getResultList().isEmpty() ){
            return null;
        }else{
            return (Usuario) q.getResultList().get(0);
        }                   
    }
    
}
