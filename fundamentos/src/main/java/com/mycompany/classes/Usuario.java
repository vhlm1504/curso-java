/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author victormendonca
 */
public class Usuario {
    
    String nome;
    String email;
    
    //sem usar o override
    public boolean equals(Object obj)//Object para usarmos polimorfismo
    {
        if(obj instanceof Usuario)
        {
            Usuario outro = (Usuario) obj; //para tratarmos especificamente de objetos Usuario
            /*boolean nomeIgual = outro.nome == this.nome;
            boolean emailIgual = outro.email == this.email;
            */
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            
            return (nomeIgual && emailIgual);
        }
        else
        {
            return false;
        }
    }
    
}
