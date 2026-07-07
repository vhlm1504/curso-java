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
public class Jantar {
    public static void main(String[] args) {
        LocalDate validade;
        Data data = new Data(10, 4, 1950);
        validade = LocalDate.of(2026, 7, 8);
        
        var prato = new Comida("Peixe frito", 15.5, 450, validade);
        var pessoa = new Pessoa("Rick", "Sanches", "12345678911", 70000, data);
        System.out.printf("%s%n", pessoa.toString());
        pessoa.comer(prato);
        System.out.printf("%.2f%n", (double)pessoa.getMassaPessoaEmGramas() / 1000);
        
    }
    
}
