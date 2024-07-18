/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicionales;
import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int Mes = 0;
        
        //Mensaje de peticion de mes
        System.out.println("Introduce el numero del mes para saber el nombre y estacion: ");
        Mes = Entrada.nextInt();
        
        if (Mes==1 || Mes==12){
            System.out.println("es invierno");
        }else if(Mes ==2 ){
            System.out.println(" Finales de invierno");
            
        } else if (Mes==3 || Mes==4 || Mes==5){
            System.out.println("Es primavera");
        
        }else if(Mes==6){
            System.out.println("Junio, finales de primavera");
            
        }else if(Mes==7 || Mes==8 ){
            System.out.println("Es verano");
            
        }else if(Mes==9){
            System.out.println("Septiembre, finales de verano");
            
        }else if (Mes==10 || Mes == 11){
            System.out.println("Es otoño");
            
        }else{
            System.out.println("Introduza un numero valido...");
        }
    }
    
}
