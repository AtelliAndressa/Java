/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import static java.lang.Math.sqrt;

/**
 *
 * @author Andressa Atelli
 */
public class Calculadora {
    
    public double somar(double num1, double num2){
       return num1 + num2;
    }
    
    public double subtrair(double num1, double num2){
       return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2){
       return num1 * num2;
    }
    
    public double dividir(double num1, double num2){
       return num1 / num2;
    }
    
    public String calcularInverso(double num){
        return String.format("%.9f", 1/num);
    }
    
    public double calcularRaiz(double num){
       return Math.sqrt(num);
    }
    
}
        
