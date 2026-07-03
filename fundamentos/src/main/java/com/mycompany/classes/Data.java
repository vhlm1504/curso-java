/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author victormendonca
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
 
    
    public Data(int dia, int mes, int ano)
    {
         if(dia < 1 || dia > 31)
            throw new IllegalArgumentException("Dia precisa ser maior que 0 e menor que 31.");
         if(mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mes precisa ser maior que 0 e menor que 12.");
         
         this.dia = dia;
         this.mes = mes;
         this.ano = ano;        
    }
    
    public void setDia(int dia)
    {
        if(dia < 1 || dia > 31)
            throw new IllegalArgumentException("Dia precisa ser maior que 0 e menor que 31.");
        this.dia = dia;
    }
    
    public int getDia()
    {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes < 1 || mes > 12)
            throw new IllegalArgumentException("Mes precisa ser maior que 0 e menor que 12.");
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public boolean anoBissexto()
    {
        if((ano % 4 == 0 && ano/100 != 00) || ano % 400 == 0)
        {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %02d/%02d/%d%n%s %s %s", 
                "Data", dia, mes, ano, ano, "e ano Bissexto?", anoBissexto() ? "sim" : "nao");
    }
    
    String obterDataFormatada()
    {
        return String.format("%02d/%02d/%02d%n", dia, mes, ano);
    }
    
}
