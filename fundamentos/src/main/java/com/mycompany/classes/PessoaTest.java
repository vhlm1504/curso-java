/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author victormendonca
 */
public class PessoaTest {
    public static void main(String[] args) {
        Data pessoaNascimento = new Data(06,07,1950);
        Pessoa pessoa = new Pessoa("Rick", "Sanches", "12345678900", 70000, pessoaNascimento);
        System.out.printf("%s%n", pessoa.toString());
    
        pessoaNascimento = new Data(10,05,2000);
        Pessoa mortSanches = new Pessoa("Mort", "Sanches", "00987654321", 50000, pessoaNascimento);
        System.out.printf("%s%n", mortSanches.toString());
    
    }
    
}
