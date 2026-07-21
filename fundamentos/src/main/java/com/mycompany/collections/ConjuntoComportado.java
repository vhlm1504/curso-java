/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * Set
 * @author victormendonca
 */
public class ConjuntoComportado {
    public static void main(String[] args)
    {
        //Set<String> listaAprovados = new HashSet<String>();//assim, fica declarado que o conjunto é de apenas objetos String
        //Set<String> lista = new HashSet<>(); só precisa especificar num dos lados.
        //se quiser ordenado pela ordem de inserção. Usar o TreeSet<>() que implementa a interface SortedSet<> que deriva da Set
        SortedSet<String> listaAprovados = new TreeSet<>();
        //ou TreeSet<String> listaAprovados = new TreeSet<>(); com a variável guardando uma referência da classe
        // ou Set<String> listaAprovados = new TreeSet<>(); porque SortedSet também é uma Set
        //a notação com <> é generics
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");
        
        for(String candidato : listaAprovados)
            System.out.println(candidato.toString());
        
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);
        
        for(Integer n : nums)
            System.out.println(n);
        for(int n : nums)
            System.out.println(n);
        
        for(Object n : nums)
            System.out.println(n);
    }
    
}
