/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;
import java.util.ArrayDeque;
import java.util.Deque;
/**
 *
 * @author victormendonca
 */
public class Pilha {
    public static void main(String[] args)    
    {
        Deque<String> livros = new ArrayDeque<String>();
        
        livros.add("O Pequeno Principe");
        //add() retorna um valor booleano
        livros.push("Don Quixote");//também acresce mas se não der certo ele não retorna qualquer aviso, só não acresce. Ou se houver limite de tamanhho e não houver espaço, ele retorna uma exception
        livros.push("O Hobbit");
        
        for(String livro : livros)
            System.out.println(livro);
        
        System.out.println(livros.peek());//retorna o último a entrar
        System.out.println(livros.element());
        
        System.out.println(livros.poll());
        //System.out.println(livros.poll());
        
        System.out.println(livros.remove());
        
        System.out.println(livros.pop()); //se a stack estiver vazia, retorna uma exception
        
        System.out.println(livros.size());
        //livros.clear();
        //livros.contains(objeto);
        System.out.println(livros.isEmpty());
    }
    
}
