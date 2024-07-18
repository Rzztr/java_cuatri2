/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicionales;
import java.util.Scanner;
/**
 *
 * @author ricar
 */
public class IMC {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        double Peso =0;
        double Estatura = 0f;

        
        System.out.println("Introduzca su peso en KG: ");
        Peso = Entrada.nextDouble(); 
        System.out.println("Introduce tu estatura mts: ");
        Estatura = Entrada.nextFloat();
        
        var IMC = Peso/(Estatura*Estatura);
        
        if(IMC<18.5){
            System.out.println("Tienes bajo peso pa' echate un bolillo");
            
        }else if(IMC<=24.9){
            System.out.println("Tienes peso normal");
            
        }else if(IMC<=29.9){
            System.out.println("Tienes sobre peso");
            
        }else if(IMC>=30){
            System.out.println("Tienes peso pumba pa' una cagada de vez en cuando");
        }else {
            System.out.println("Introduce de nuevo los datos...");
        } 
    }
    
}
