/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.udb.edu.controladores;

import java.io.IOException;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import sv.udb.edu.entidades.Usuario;
import sv.udb.edu.modelos.UsuarioFacade;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author jorge
 */
@Named(value = "loginControl")
@SessionScoped
public class LoginControl  implements Serializable  {

    @EJB 
    private UsuarioFacade usuarioFacade;
    
    private String usuario;
    private String claveCifrada;
    
    private Usuario usuarioValidado;
        
    @PostConstruct
    public void init(){
    
    }
    
    public String validarUsuario(){
       claveCifrada = DigestUtils.sha512Hex(claveCifrada);        
       usuarioValidado =  new Usuario();
       usuarioValidado = usuarioFacade.buscarUsuario(   usuario  , claveCifrada );
       if( usuarioValidado != null  ){
           FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario" , usuarioValidado );
           return "procesos/facturacion/lista.xhtml?faces-redirect = true";
       }else{
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN , "Error" , "Usuario invalido")   );
           return null;
       }
        
    }
    
    
    public void cerrarSesion(){
      
        try {
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
            FacesContext.getCurrentInstance().getExternalContext().redirect("/Factura");            
        }catch (IOException e){
            System.out.println("Error al cerrar la sesion "+e);
        }
    }

    public UsuarioFacade getUsuarioFacade() {
        return usuarioFacade;
    }

    public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClaveCifrada() {
        return claveCifrada;
    }

    public void setClaveCifrada(String claveCifrada) {
        this.claveCifrada = claveCifrada;
    }

    public Usuario getUsuarioValidado() {
        return usuarioValidado;
    }

    public void setUsuarioValidado(Usuario usuarioValidado) {
        this.usuarioValidado = usuarioValidado;
    }
    
    
    
    
    
}
