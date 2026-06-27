/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;
import javax.swing.JOptionPane;
/**
 *
 * @author victormendonca
 */
public class ConversaoStringNumero {
    public static void main(String[] args)
    {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        
        System.out.println(valor1 + valor2);
        
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        
        double soma = numero1 + numero2;
        System.out.println(soma);
        
    }
    
}
