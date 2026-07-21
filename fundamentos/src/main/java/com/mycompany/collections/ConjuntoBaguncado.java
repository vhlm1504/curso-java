/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;
import java.util.HashSet;
import java.util.Set;
/**
 * Set
 * @author victormendonca
 */
public class ConjuntoBaguncado {
    
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.6);//como não aceita tipos primitivos, aqui ocorre o cast implicitamente para um objeto Double
        conjunto.add(2);
        conjunto.add("string");
        conjunto.add(true);
        conjunto.add('x');
        
        System.out.println(conjunto.size());
        
        conjunto.add(1.6); //repetido não é gravado
        
        System.out.println(conjunto.size());
        
        System.out.printf("%b%n", conjunto.remove("teste"));
        System.out.printf("%b%n", conjunto.remove("string"));
        System.out.printf("%b%n", conjunto.remove(1.6));
        
        for(Object elemento : conjunto)
            System.out.println(elemento);
        
        System.out.println(conjunto.size());
        
        System.out.printf("%b%n", conjunto.contains('x'));
        System.out.printf("%b%n", conjunto.contains(1.6));
        
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums.toString());
        System.out.println(conjunto.toString());
        
        conjunto.addAll(nums);//pegar tudo que tem dentro de nums e jogar dentro de conjunto. União entre dois conjuntos
        System.out.println(conjunto.toString());//como o 2 é repetido, não duplica.
        
        //interseção 
        conjunto.retainAll(nums);
        System.out.println(conjunto.toString());
        nums.clear();
        System.out.println(nums.toString());
        
    }
    
}
