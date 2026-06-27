/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author victormendonca
 */
public class ConverteTemperaturaFC {
    
    private double temperaturaFahrenheit;
    private double temperaturaCelsius;

    public double getTemperaturaFahrenheit() {
        return temperaturaFahrenheit;
    }

    public void setTemperaturaFahrenheit(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }
    
    public double fahrenheitParaCelsius()
    {
        return (this.temperaturaFahrenheit - 32) * 9/5;
    }
    
    public double celsiusParaFahrenheit()
    {
        return (this.temperaturaCelsius * (9/5) + 32);
    }
    
}
