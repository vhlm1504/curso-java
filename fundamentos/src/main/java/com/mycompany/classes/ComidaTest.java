/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.time.LocalDate;

/**
 *
 * @author victormendonca
 */
public class ComidaTest {
    public static void main(String[] args) {
        var validade = LocalDate.of(2026, 6, 30);
        //Comida prato = new Comida("Padrao", 17.0, 600, validade);
        //ou
        Comida prato = new Comida("Padrao", 17.0, 600, LocalDate.of(2026, 6, 30)); //porque não são muitas chamadas
        
        System.out.printf("%s%n", prato.toString());
        System.out.printf("%s%n", Comida.estaVencida(prato) ? "Boa para consumir" : "Vencida");
    }
    
}
