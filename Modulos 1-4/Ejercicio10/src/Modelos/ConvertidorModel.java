/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.text.DecimalFormat;

/**
 *
 * @author Douglas
 */
public class ConvertidorModel {
    
    private double dolares = 0.0000;
    private double euros = 0.84;
    
    public ConvertidorModel()
    {
        
    }

    public double getDolares() {
        return dolares;
    }

    public void setDolares(double dolares) {
        this.dolares = dolares;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }
    
    public String convertirDolaresAEuros()
    {
        euros = (dolares * euros);
        String textoEuros = String.format("%.4f", euros);
        return textoEuros;
    }
}
