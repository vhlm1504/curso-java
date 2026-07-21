/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections;

import java.util.Objects;

/**
 *
 * @author victormendonca
 */
public class Usuario {
    
    String nome;
    
    Usuario(String nome)
    {
        this.nome = nome;
    }
    
    public String toString()
    {
        return "Meu nome e " + this.nome + ".";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    
    
}
