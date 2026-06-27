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
public class CalculadoraIMC {
    
    public static double imc(double massa, double altura)
    {
        return massa / Math.pow(altura, 2);        
    }
    
}
