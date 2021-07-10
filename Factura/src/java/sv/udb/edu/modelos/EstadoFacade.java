/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.modelos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.udb.edu.entidades.Estado;

/**
 *
 * @author jorge
 */
@javax.ejb.Stateless
public class EstadoFacade extends AbstractFacade<Estado> {

    @PersistenceContext(unitName = "FacturaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoFacade() {
        super(Estado.class);
    }
    
}
