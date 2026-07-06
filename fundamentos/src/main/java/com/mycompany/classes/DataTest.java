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
        Data dataDefault = new Data();
        System.out.printf("%s%n%s%n", "com os dados do construtor", data.toString());
        System.out.println();
        System.out.printf("%s.%n", dataDefault.toString());
        System.out.println();
        var novaData = new Data(16, 11, 2000);
        System.out.printf("%s.%n", novaData.toString());
        
       
    }
   
}
