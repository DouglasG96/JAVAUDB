/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modulo5.tarea2.udb;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.ResizeEvent;

@Named
@RequestScoped
public class ResizableView {

    public void onResize(ResizeEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Image resized", "Width:" + event.getWidth() + ",Height:" + event.getHeight());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}