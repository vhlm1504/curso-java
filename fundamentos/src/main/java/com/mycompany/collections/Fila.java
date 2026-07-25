/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author victormendonca
 */
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Ana");//se não houver lugar, lança uma exceção
        fila.offer("Bia"); //método para adicionar também, como o add, mas aqui ele verifica se a fila tem lugar sobrando porque existem filas com restrição de tamanho. Caso não aja espaço, retorna false
        fila.offer("Carlos");
        fila.add("Daniel");
        fila.offer("Bia");
        fila.offer("Rafaela");
        fila.add("Gui");
        
        System.out.println(fila.peek()); //ler o primeiro elemento da fila.
        System.out.println(fila.element());//também retorna o primeiro elemento da fila. 
        // a diferente entre peek() e element() é quando a fila está vazia. peek() retorna null, element() lança exceção
        
        //fila.clear();//limpa a fila
        fila.size();// tamanho
        fila.isEmpty(); //está ou não vazia
        //fila.contains(objeto); verifica se o objeto está na fila
        
        System.out.println(fila.poll());//retorna o primeiro elemento da fila e o remove
        System.out.println(fila.poll()); //se não houver mais elementos, ele retorna null
        
        System.out.println(fila.remove());// também retorna o primeiro e remove. a diferença é que se a fila estiver vazia, ele lança uma exceção, exception
        
        
        
        
    }
    
}
