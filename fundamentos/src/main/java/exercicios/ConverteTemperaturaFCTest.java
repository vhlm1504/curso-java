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
public class ConverteTemperaturaFCTest {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ConverteTemperaturaFC tem = new ConverteTemperaturaFC();
        
        System.out.println("Entre com a temperatura por favor: ");
        double temperatura = Double.parseDouble(input.nextLine());
        tem.setTemperaturaFahrenheit(temperatura);
        tem.setTemperaturaCelsius(temperatura);
        
        System.out.printf("Temperatura em Fahreinheit: %f%n", tem.celsiusParaFahrenheit());
        System.out.printf("Temperatura em Celsius: %f%n", tem.fahrenheitParaCelsius());
        
        input.close();
        
    }
    
}
