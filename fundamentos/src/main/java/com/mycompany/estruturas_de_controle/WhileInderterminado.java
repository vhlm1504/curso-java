/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturas_de_controle;
import java.util.Scanner;
/**
 *
 * @author victormendonca
 */
public class WhileInderterminado {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String valor = "";
        
        while(!valor.equalsIgnoreCase("sair"))
        {
            System.out.print("Você diz: ");
            valor = input.nextLine();
        }
        input.close();
    }
}
