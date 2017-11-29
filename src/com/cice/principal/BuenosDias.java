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
public class BuenosDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
        int hora =0;
        
        System.out.println("Introduzca la hora del día");
        hora = sc.nextInt();
        
        if (hora < 1 || hora > 24){
            System.out.println("Hora errónea " + hora);
        }
        else if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días!! " + hora);
            
        }
        else if (hora > 12 && hora < 19){
            System.out.println("Buenas tardes!! " + hora);
        }        
        else{
            System.out.println("Buenas noches!! " + hora);
        }
    }
    
}
