/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author victormendonca
 */
public class Mapa {
    public static void main(String[] args)
    {
        Map<Integer, String> usuarios = new HashMap<>();
        //Map não tem o método add, tem o put. Também substitui.
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo"); // sobrescreve o nome associado a chave 1.
        usuarios.put(2, "Rafaela");
        usuarios.put(3, "Rebeca");
        
        System.out.println(usuarios.size()); //não mantém ordem de entrada
        System.out.println(usuarios.isEmpty());
        
        System.out.println(usuarios.keySet());//chave
        
        System.out.println(usuarios.values()); //valor
        
        System.out.println(usuarios.entrySet());//chave e valor ao mesmo tempo
        
        System.out.println(usuarios.containsKey(20));
        System.out.printf("%b%n", usuarios.containsValue("Rebeca"));
        
        System.out.printf("%s%n", usuarios.get(4));
        
        for(int chave : usuarios.keySet())
            System.out.println(chave);
        
        for(String valor : usuarios.values())
            System.out.println(valor);
        
        for(Map.Entry<Integer, String> registro : usuarios.entrySet())
            System.out.println(registro);
        
        System.out.println(usuarios.remove(1));
        
        for(Map.Entry<Integer, String> registro : usuarios.entrySet())
            System.out.println(registro.getKey() + "::" + registro.getValue());
    }
    
}
