/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author victormendonca
 */
public class DataTest {
    public static void main(String[] args)
    {
        Data data = new Data(01, 07, 2026); //números soltos são vistos como ints pelo javac. se quiser usar short tem que usar o cast
        System.out.printf("%s %s%n", "com os dados do construtor", data.toString());
        
        var novaData = new Data(16, 11, 2000);
        System.out.printf("%s.%n", novaData.toString());
        
        
    }
    
    
    
}
