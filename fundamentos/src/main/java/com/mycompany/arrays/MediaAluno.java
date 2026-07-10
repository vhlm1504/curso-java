/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;


/**
 *
 * @author victormendonca
 */
public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s ", "Quantas notas?");
        int size = input.nextInt();
        double somaDeNotas = 0.0;
        double[] notas = new double[size];
        System.out.println("Entre as notas");
        while(size > 0)
        {
            notas[size - 1] = input.nextDouble();
            somaDeNotas += notas[size-1];
            
            size--;
        }
        
        
        int length = notas.length;
        //double soma = 0.0;
        while (0 < length--)
        {
            //notas[length] = input.nextDouble();
            //soma += notas[length];
            System.out.printf("%.1f%n", notas[length]);
        }
        
        System.out.println();
        System.out.printf("%s: %.1f%n%s%n", "Media", somaDeNotas/notas.length, 7.0 <= somaDeNotas/notas.length ? "Aprovado" : "Reprovado");
        
        double somaParaMedia = 0;
        for(double nota : notas)
            somaParaMedia += nota;
        System.out.printf("%.1f%n%s", somaParaMedia/notas.length, somaParaMedia/notas.length >= 7.0 ? "Aprovado" : "Reprovado");
            
    }
    
}
