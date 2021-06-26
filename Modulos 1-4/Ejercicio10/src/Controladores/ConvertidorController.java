/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.ConvertidorModel;

/**
 *
 * @author Douglas
 */
public class ConvertidorController {
    
    private double dolares = 0.0000;
    private double euros = 0.0000;
    private String txtDolares = "";
    ConvertidorModel objConvertidorModel;
    
    public ConvertidorController()
    {
        objConvertidorModel = new ConvertidorModel();
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

    public String getTxtDolares() {
        return txtDolares;
    }

    public void setTxtDolares(String txtDolares) {
        this.txtDolares = txtDolares;
    }

    public boolean validarNumero()
    {
        try
        {
            dolares = Double.parseDouble(this.txtDolares);
            return true;   
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public String convertirDolaresAEuros()
    {
       objConvertidorModel.setDolares(dolares);
       return objConvertidorModel.convertirDolaresAEuros();
    }
            
}
