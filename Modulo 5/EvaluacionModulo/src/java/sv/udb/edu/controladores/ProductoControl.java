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
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import sv.udb.edu.entidades.Producto;

/**
 *
 * @author jorge
 */
@Named(value = "productoControl")
@ViewScoped
public class ProductoControl implements Serializable {

  
    private List<Producto> productos;
    private Producto producto;
    
    
    @PostConstruct
    public void init(){
        producto =  new Producto();
        productos = new ArrayList<Producto>();
        
        productos.add( new Producto("1","Leche")  );
        productos.add( new Producto("2","Huevos")  );
        productos.add( new Producto("3","Queso")  );
  
    }
    
    public void agregarProducto(){
        productos.add( producto );
        producto =  new Producto();
        System.out.println( productos   );
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
    
}
