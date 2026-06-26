/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

import java.util.Scanner;

/**
 *
 * @author victormendonca
 */
public class Wrapper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;
        Integer o = Integer.parseInt("1000"); //string em inteiro
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        
        Boolean bo = Boolean.parseBoolean("true");
        
        input.close();
        
        
        
    }
    
}
