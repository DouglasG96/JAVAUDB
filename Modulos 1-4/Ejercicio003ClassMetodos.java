/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio003;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author l84119663
 */
public class Ejercicio003ClassMetodos {

    private static double parseStringToDouble(String value) {
        return value == null || value.isEmpty() ? Double.NaN : Double.parseDouble(value);
    }
    private double num1;
    private double num2;
    private double hamburguesa = 2.50;
    private double papas = 0.50;
    private double refresco = 0.50;
    private double pizza = 4.00;
    private double gaseosa = 0.60;
    private double ensalada = 3.00;
    private double yogurt = 0.50;
    private double agua = 0.60;

    public Ejercicio003ClassMetodos() {
        this.num1 = 0d;
        this.num2 = 0d;
    }
//metodo propio
//    double sumar = (getNum1() + getNum2());
//    String sumresult = String.valueOf(sumar);

    public double calcularSuma() {
        return num1 + num2;
    }

    public double calcularResta() {
        return num1 - num2;
    }

    public double calcularMult() {
        return num1 * num2;
    }

    public double calcularDiv() {
        return num1 / num2;
    }

    public double calcularCombo1() {
        return ((num1 * hamburguesa) + (num1 * papas) + (num1 * refresco));
    }

    public double calcularCombo2() {
        return ((num1 * pizza) + (num1 * gaseosa));
    }

    public double calcularCombo3() {
        return ((num1 * ensalada) + (num1 * yogurt) + (num1 * agua));
    }

    public double calcularOtrasOpciones() {
        
        double ham = num1 * hamburguesa;
        double pap = num1 * papas;
        double ref = num1 * refresco;
        double piz = num1 * pizza;
        double gas = num1 * gaseosa;
        double ens = num1 * ensalada;
        double you = num1 * yogurt;
        double agu = num1 * agua;
        
        

        return (ham += pap += ref += piz += gas += ens += you += agu);
    }

    //BigDecimal
    public double calcularCambio() {
        return BigDecimal.valueOf(num1 - num2).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

    //set & get
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(double hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public double getPapas() {
        return papas;
    }

    public void setPapas(double papas) {
        this.papas = papas;
    }

    public double getRefresco() {
        return refresco;
    }

    public void setRefresco(double refresco) {
        this.refresco = refresco;
    }

    public double getPizza() {
        return pizza;
    }

    public void setPizza(double pizza) {
        this.pizza = pizza;
    }

    public double getGaseosa() {
        return gaseosa;
    }

    public void setGaseosa(double gaseosa) {
        this.gaseosa = gaseosa;
    }

    public double getEnsalada() {
        return ensalada;
    }

    public void setEnsalada(double ensalada) {
        this.ensalada = ensalada;
    }

    public double getYogurt() {
        return yogurt;
    }

    public void setYogurt(double yogurt) {
        this.yogurt = yogurt;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }
}
