/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicionales;
import java.util.Scanner;
/**
 *
 * @author ricar
 * if else
 */
public class Condicionales {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
     /* 
        //Sintaxis
        var Condicion = true;
        
        if (Condicion){
            System.out.println("La variable condicion es verdadera");           
        }
        else{
            System.out.println("La variable condicion es falsa");
        }
    */
    /*
        //ejemplo 2
        var exp1= (5+3)*2/3f;
        var exp2 = 10*5/3+(2/5f);
        System.out.println("exp1 = " + exp1);
        System.out.println("exp2 = " + exp2);
        
        if(exp1>exp2){
            System.out.println("La expresion 1 es mayor");    
        }
        else{
            System.out.println("La expresion 2 es mayor");
        }
        
    */  
    /*
        //ejemplo 3
        var cal = 8f;
        if (cal>=8 && cal<10 ){
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Reprobado");
        }
    */
        
        var Carrera = "";
        var Calificacion =0f;
        
        System.out.println("Introduzca la carrera: ");
        Carrera = Entrada.nextLine();
        System.out.println("Introduzca el promedio: ");
        Calificacion = Entrada.nextFloat();
        
        if (Carrera.equalsIgnoreCase("Tics") && Calificacion>=9){
            System.out.println("aplica para la beca...");
        }
        else{
            System.out.println("No Aplica para la beca...");
            
        }
    }  
}
