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
public class AnoBissexto {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Entrar o ano: ");
        int ano = input.nextInt();
        System.out.println();
        
        System.out.printf("E bissexto? %s%n", (eBissexto(ano) ? "Sim" : "Nao"));
    }
        
    public static boolean eBissexto(int ano)
    {
        if((ano % 4 == 0 && ano/100 != 00) || ano % 400 == 0)
        {
            return true;
        }
        return false;
    }
    
}
