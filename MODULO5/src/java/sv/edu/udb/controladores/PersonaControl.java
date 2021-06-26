/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.controladores;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.entidades.Persona;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@ManagedBean(name = "personaControl")
@ViewScoped
public class PersonaControl {
    private Persona persona;
    
    @PostConstruct
    public void init()
    {
        
    }

    /**
     * Creates a new instance of PersonaControl
     */
    public PersonaControl() {
    }
    
}
