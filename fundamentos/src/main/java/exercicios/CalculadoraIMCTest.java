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
public class CalculadoraIMCTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com altura em metros: ");
        double altura = input.nextDouble();
        //input.nextInt();
       
        System.out.println("Entre com a massa em quilogramas: ");
        double massa = input.nextDouble();
        //input.nextInt();
        
        System.out.printf("IMC: %f%n", CalculadoraIMC.imc(massa, altura));
        
        input.close();
    }
    
}
