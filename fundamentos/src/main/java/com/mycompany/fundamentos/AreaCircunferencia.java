/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

/**
 *
 * @author victormendonca
 */
public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;
        
        System.out.println(raio * raio * PI);
        double area = PI * raio * raio;
        System.out.println("area: " + area);
    }
    
}
