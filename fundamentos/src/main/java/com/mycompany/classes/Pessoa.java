/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;
import com.mycompany.classes.Data;
import java.time.*;
/**
 *
 * @author victormendonca
 */
public class Pessoa {
    
    private String firstName;
    private String lastName;
    private String cpf;
    private  Data nascimento;
    private int age = 0;
    private static int countId = 0;
    private static final String PREFIXO_ID = "20260";
    private int id = 0;
    private int massaPessoaEmGramas = 0;
    java.time.LocalDate dataAtual = java.time.LocalDate.now();
    
    public Pessoa(String firstName, String lastName, String cpf, int massaPessoaEmGramas, Data dataNascimento)
    {
        if(cpf.length() < 11 || cpf.length() > 11)
            throw new IllegalArgumentException("CPF must be 11 digits.");
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        nascimento = dataNascimento;
        this.massaPessoaEmGramas = massaPessoaEmGramas;
        System.out.println(dataAtual.getYear());
                
        if(dataAtual.getMonthValue() > nascimento.getMes())  
        {
            age = (dataAtual.getYear() - nascimento.getAno());
        }
        else if((dataAtual.getMonthValue() == nascimento.getMes()) && (dataAtual.getDayOfMonth() >= nascimento.getDia()))
        {
            age = (dataAtual.getYear() - nascimento.getAno());
        }
        else
        {
            age = (dataAtual.getYear() - nascimento.getAno()) - 1;
        }
        
        if(age < 18)
            throw new IllegalArgumentException("Must be legal age.");
                
        id = Integer.parseInt(String.format("%s%d", PREFIXO_ID, ++countId));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        
        if((dataAtual.getMonthValue() >= nascimento.getAno()) && (dataAtual.getDayOfMonth() >= nascimento.getDia()))
        {
            age = (dataAtual.getYear() - nascimento.getAno());            
        }
        else
        {
            age = (dataAtual.getYear() - nascimento.getAno()) - 1;
        }
        if(age < 18)
            throw new IllegalArgumentException("Must be legal age.");
                
        this.nascimento = nascimento;
    }

    public int getAge() {
        return age;
    }
  
    public int getId() {
        return id;
    }
    
    public void setMassaPessoaEmGramas(int massaPessoaEmGramas) {
        this.massaPessoaEmGramas = massaPessoaEmGramas;
    }
    
    public void comer(Comida prato)
    {
        setMassaPessoaEmGramas(getMassaPessoaEmGramas() + prato.getMassaEmGramas());  
    }

    public int getMassaPessoaEmGramas() {
        return massaPessoaEmGramas;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "firstName=" + firstName + ", lastName=" + lastName + ", cpf=" + cpf + ", nascimento=" + nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno() + ", age=" + age + ", id=" + id + ", massaEmGramas=" + getMassaPessoaEmGramas() + '}';
    }

    
    
}
