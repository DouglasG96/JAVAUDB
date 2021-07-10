package sv.edu.udb.entidades;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */


public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private int contador;
    private Date fechaNacimiento;
    private String telefono;
    private String dui;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, int edad, int contador, Date fechaNacimiento, String telefono, String dui) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.contador = contador;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.dui = dui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }
    
    
}
