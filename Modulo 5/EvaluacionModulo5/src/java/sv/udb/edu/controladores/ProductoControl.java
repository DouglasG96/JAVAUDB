/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sv.udb.edu.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import sv.udb.edu.modelos.ProductoFacade;
import sv.udb.edu.entidades.Producto;

@ManagedBean(name = "productoControl")
@ViewScoped
public class ProductoControl implements Serializable{
    
    @EJB
    private ProductoFacade productoFecade;
    
    private Producto producto;
    private List<Producto> listaProducto;
    
    @PostConstruct
    public void init()
    {
        listaProducto = productoFecade.findAll();
        producto = new Producto();
    }
    
    public void guardarProducto()
    {
        try
        {
            productoFecade.create(producto);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public ProductoFacade getProductoFecade() {
        return productoFecade;
    }

    public void setProductoFecade(ProductoFacade productoFecade) {
        this.productoFecade = productoFecade;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
}
