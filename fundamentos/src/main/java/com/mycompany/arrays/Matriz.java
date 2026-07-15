/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author victormendonca
 */
public class Matriz {
    
    public static void main(String[] args)
    {
        var input = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int quantosAlunos = input.nextInt();
        System.out.println("Quantas notas?");
        int quantasNotas = input.nextInt();
        
        double[][] notasDaTurma = new double[quantosAlunos][quantasNotas];
        int lenght = notasDaTurma.length;
        
        for(int i = 0; i < lenght; i++)
        {
            for(int j = 0; j < quantasNotas; j++)
            {
                System.out.printf("%s %d do aluno %d: ","Entre a nota", j+1, i+1);
                notasDaTurma[i][j] = input.nextDouble();
                System.out.println();
            }
        }
        
        for(double[] linhaCurrentStudent : notasDaTurma)
        {
            System.out.println(Arrays.toString(linhaCurrentStudent));
        }
        
        /*for(int i = 0; i < lenght; i++)
        {
            for(int j = 0; j < quantasNotas; j++)
            {
                System.out.printf("Aluno %d nota %d: %.1f%n", i+1, j+1, notasDaTurma[i][j]);
                
            }
        }
        */
        System.out.println();
        
        input.close();
        
    }
}

/*
class Alunos
{
    String nome;
    String numeroRegistro;  
}
*/
