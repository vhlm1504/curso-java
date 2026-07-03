/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author victormendonca
 */
public class Produto {
    
    String nome;
    double preco; 
    double desconto;
    
    double precoComDesconto()
    {
        return preco * ( 1 - desconto);
    }
    
    double precoComDesconto(double descontoDoGerente)
    {
        return preco * ( 1 - (desconto + descontoDoGerente));
    }
}
