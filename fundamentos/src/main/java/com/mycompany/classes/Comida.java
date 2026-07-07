/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.time.LocalDate;

/**
 *
 * @author victormendonca
 */
public class Comida {
    
    private String nomePrato;
    private double preco;
    private int massaEmGramas;
    private LocalDate dataValidade;
    private static LocalDate time = LocalDate.now();

    public Comida(String nomePrato, double preco, int massaEmGramas, LocalDate dataValidade) {
        this.nomePrato = nomePrato;
        this.preco = preco;
        this.massaEmGramas = massaEmGramas;
        this.dataValidade = dataValidade;
    }
    
    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMassaEmGramas() {
        return massaEmGramas;
    }

    public void setMassaEmGramas(int massaEmGramas) {
        this.massaEmGramas = massaEmGramas;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
   
    public static boolean estaVencida(Comida pratoDia)
    {
        return time.isBefore(pratoDia.getDataValidade());
    }

    @Override
    public String toString() {
        return "Comida{" + "nomePrato=" + nomePrato + ", preco=" + preco + ", massaEmGramas=" + massaEmGramas + ", dataValidade=" + dataValidade + '}';
    }
    
    
    
}
