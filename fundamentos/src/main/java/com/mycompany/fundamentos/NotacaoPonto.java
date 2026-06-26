/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

/**
 *
 * @author victormendonca
 */
public class NotacaoPonto {
    public static void main(String[] args) {
        
        String s = "Bom dia";        
        System.out.println(s);
        
        s = s.toUpperCase();
        System.out.println(s);
        
        s = "HENRIQUE VEIO ME VER".toLowerCase();
        System.out.println(s);
        
        System.out.println(s.replace("h", "H"));
        s = s.concat("!"); //junta uma string ao final 
        System.out.println(s);
        
        String y = "Bom dia X".replace("X", "Cissa").toUpperCase().concat("!"); //contanto que o retorno do método seja uma String também
        System.out.println(y);
        
        
        
        
        
        
    }
    
}
