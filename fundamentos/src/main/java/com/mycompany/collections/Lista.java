/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;
import java.util.ArrayList;
/**
 *
 * @author victormendonca
 */
public class Lista {
    public static void main(String[] args) {
        
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        
        for(Usuario u : lista)
            System.out.println(u.nome);
        
        System.out.println(lista.get(3).nome);
        System.out.println(lista.get(3));
        System.out.println(lista.get(3).toString());
        
        for(Usuario u : lista)
            System.out.println(u.toString());
        
        //removendo
        System.out.println("index " + lista.remove(1)); //neste caso passando um index. retorna o objeto removido e o remove
        System.out.println("objeto " + lista.remove(new Usuario("Manu"))); //neste caso passando um objeto com o atributo que desejo remover. retorna true quando um objeto com o atributo é encontrado
        //no caso de passar por objeto, é possível porque o equals e o hashCode estão implementados corretamente.
        
        System.out.printf("%b%n", lista.contains(new Usuario("Lia")));
        for(Usuario u : lista)
            System.out.println(u.toString());
        
        
    }
    
}
