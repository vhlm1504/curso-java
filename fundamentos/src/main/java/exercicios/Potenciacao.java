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
public class Potenciacao {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("entre com um valor inteiro: ");
        int num = input.nextInt();
        
        System.out.printf("Inteiro ao quadrado: %f%nInteiro ao cubo: %f%n", Math.pow(num, 2), Math.pow(num, 3));
        
        
        input.close();
    }
    
    
    
}
