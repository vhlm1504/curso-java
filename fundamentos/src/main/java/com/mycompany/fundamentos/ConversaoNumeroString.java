/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

/**
 *
 * @author victormendonca
 */
public class ConversaoNumeroString {
    public static void main(String[] args)
    {
        Integer num1 = 1000;
        System.out.println(num1.toString().length());
        //primeiro converte para string para poder usar o length(), próprio de string
        int num2 = 10000;
        System.out.println(Integer.toString(num2).length());
        System.out.println(("" + num1).length());// java entende que a operação vai resultar em uma string
       
    }
    
}
