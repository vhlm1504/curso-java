/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

/**
 *
 * @author victormendonca
 */
public class TipoString {
    
    public static void main(String[] args) {
        
        var nome = "Pedro";
        var sobrenome = "Santos";
        var salario = 12345.44;
        
        System.out.println("Olá pessoal".charAt(2));
        
        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nSalario: " + salario + "\n\n";
        
        "frase qualquer".contains("qual"); //true
        "rase qualquer".indexOf("qual");
        "frase qualquer".substring(6); //pega o texto a partir e incluindo caractere 6
        "frase qualquer".substring(6, 8); //pega caracteres do 6 ao 7, um a menos que o limite superior
                
    }
}
