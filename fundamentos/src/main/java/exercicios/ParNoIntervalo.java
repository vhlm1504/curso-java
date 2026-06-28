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
public class ParNoIntervalo {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Entrar o lim inferior: ");
        int limInf = input.nextInt();
        //input.nextInt();
        System.out.println();
        
        System.out.printf("Entrar o lim superior: ");        
        int limSup = input.nextInt();
        //input.nextInt();
        System.out.println();
        
        System.out.printf("Entrar a chave: ");        
        int chave = input.nextInt();
        //input.nextInt();
        System.out.println();
               
        System.out.println("O numero e par e esta no limite delimitado? " + (ePar(limInf, limSup, chave) ? "Sim" : "Não"));
    }
    
    private static boolean ePar(int limInf, int limSup, int chave)
    {
        if((chave % 2 == 0) && chave >= limInf && chave <= limSup)
        {
            return true;
        }
        return false;        
    }
    
}
