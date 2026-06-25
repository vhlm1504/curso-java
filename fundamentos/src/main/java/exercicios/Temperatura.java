/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author victormendonca
 */
public class Temperatura {
    public static void main(String[] args) {
        final double coefDeConversao = 9/5;
        final int zeroCelsiusEmFahrenheit = 32;
        double temperaturaC = 100;
        double temperaturaF = 100;
        
        double cToF = (temperaturaC * coefDeConversao) + zeroCelsiusEmFahrenheit;
        double fToC = (temperaturaF + zeroCelsiusEmFahrenheit) * coefDeConversao;
        
        System.out.println("Celsius para Fahrenheit: " + cToF);
        System.out.println("Fahrenheit para Celsius " + fToC);
    //(0 °C × 9/5) + 32 = 32 °F
    }
    
}
