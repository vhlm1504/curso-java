/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Arrays;

/**
 *
 * @author victormendonca
 */
public class Exercicio {
    
    public static void main(String[] args)
    {
        double[] notasAlunoA = new double[4];
        //double [] notasAlunoA = new double[3];
        //double []notasAlunoA = new double[3];
        //double notasAlunoA[] = new double[3];
        
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.8;
        int notasAlunoAlength =  notasAlunoA.length;
        
        /*
        System.out.printf("%s%n", Arrays.toString(notasAlunoA));
        
        for(int i = 0; i < notasAlunoAlength; i++)
            System.out.printf("%s[%d] = %.1f.%n", "notasAlunoA", i, notasAlunoA[i]);
        
        int j = 0; 
        while(j < notasAlunoAlength)
        {
            System.out.printf("%s[%d]: %.1f; ", "notasAlunoA", j, notasAlunoA[j]);
            j++;
        }
        
        System.out.println();
        */
        int k = 0;
        while(k++ < notasAlunoAlength)
        {
            System.out.printf("%s[%d]: %.1f%n", "notasAlunoA", k-1, notasAlunoA[k-1]);
        }
        
        System.out.println();
        //Exercicio e = new Exercicio();
        try
        {
        double mediaAluno = media(notasAlunoA);
        System.out.printf("%s: %.1f.%n%s.%n", "Media", mediaAluno, mediaAluno > 7.0 ? "Aprovado" : "Reprovado");
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        
        double[] notasAlunoB = {6.9, 8.9, 5.5, 8.5};
        double mediaAluno = media(notasAlunoB);
        System.out.printf("%s: %.1f.%n%s.%n", "Media", mediaAluno, mediaAluno > 7.0 ? "Aprovado" : "Reprovado");
        
        double[] notasAlunoC = {5.5, 4.0, 7.6, 8.7};
        System.out.printf("%s%n", "for each");
        for(double notas : notasAlunoC)
        {
            System.out.printf("%.1f%n", notas);
        }
       
    }
    
    private static double media(double[] notas)
    {
        int i = 0;
        int length = notas.length;
        double somaNotas = 0;
        
        //if(4 > length || 4 < length)
        if(!(4 == length))
            throw new IllegalArgumentException("Notas insuficientes.");
        
        while(i < length)
        {
            somaNotas += notas[i];
            i++;
        }
        return (somaNotas/(double)length);
    }
    
}
