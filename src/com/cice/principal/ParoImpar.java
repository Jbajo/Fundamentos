/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import java.util.Scanner;

/**
 *
 * @author penka
 */
public class ParoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int numero =0;
        
        System.out.println("Introduzca un numero entero para comprobar si es par o impar");
        numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println(numero + " es par");
        }   
        else{
            System.out.println(numero + " es impar");
        }
        
    }
    
}
