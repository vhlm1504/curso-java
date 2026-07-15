/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author victormendonca
 */
public class Equals {
    
    public static void main(String[] args)
    {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@zemail.com";
        
        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@zemail.com";
        
        //antes de implementan o equals
        System.out.println(u1 == u2);//false
        System.out.println(u1.equals(u2));//false
        System.out.println(u2.equals(u1));//false
        
        
    }
    
}
