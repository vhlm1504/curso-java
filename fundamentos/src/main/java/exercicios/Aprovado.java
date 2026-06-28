/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;

/**
 *
 * @author victormendonca
 */
public class Aprovado {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Entrar primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println();
        
        System.out.printf("Entrar segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println();
        
        double media = (nota1 + nota2)/2;
        
        if(media >= 7.0)
            System.out.printf("Aprovado%n");
        else if(media < 7.0 && media > 4.0)
            System.out.printf("Recuperacao%n");
        else if(media < 4.0)
            System.out.printf("Reprovado");
        
    }
    
}
