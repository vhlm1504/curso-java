/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;
import java.util.Scanner;

/**
 *
 * @author victormendonca
 */
public class DesafioConversao {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Salario 3: ");
        String salario3 = input.nextLine().replace(",", ".");
        System.out.println("Salario 2: ");
        String salario2 = input.nextLine().replace(",", ".");
        System.out.println("Salario 1: ");
        String salario1 = input.nextLine().replace(",", ".");
        Double.parseDouble(salario1);
        
        double mediaSalario = (Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario2))/3;
        System.out.println(mediaSalario);
        
        input.close();
        
    }
    
    
    
}
