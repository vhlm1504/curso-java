/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author victormendonca
 */
public class ProdutoTest {
    public static void main(String[] args) {
        
              
        Produto p1 = new Produto();
        p1.nome = "Lapttop";
        p1.preco = 4356.34;
        p1.desconto = 0.25;
        
        var p2 = new Produto();//instanciando por inferência
        p2.nome = "Caneta Preta";
        p2.preco = 12.60;
        p2.desconto = 0.29;
        
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(.25);
        System.out.printf("%s: %.2f%n%s: %.2f%n", "Preço final 1", precoFinal1, "Preço final 2", precoFinal2);
        System.out.println(precoFinal1 + precoFinal2);
    }
    
}
