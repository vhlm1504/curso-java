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
public class Eprimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Entre o numero: ");
        int num = input.nextInt();
        System.out.println();
        
        System.out.printf("E primo? %s%n", (ePrimo(num) ? "Sim" : "Nao"));
        
        input.close();
    }
    
    private static boolean ePrimo(int num)
    {
        if(num == 1)
            return false;
        
        if(num == 2 || num == 3)
            return true;
        
        if(num % 10 == 1 || num % 10 == 3 || num % 10 == 7 || num % 10 == 9)
        {
            int f = 0;
            for(int i = 3; i < num; i++)
            {
                if(num % i == 0)
                    return false;
                else
                    return true;
            }
        }
        return false;
    }    
    
}
