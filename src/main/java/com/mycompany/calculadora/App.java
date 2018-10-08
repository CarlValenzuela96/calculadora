/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author Carl
 */
public class App {
    public static void main(String[]args){
        Calculadora c = new Calculadora();
        double sum= c.suma(1, 2);
        System.out.println(sum);
    }
}
