package com.mycompany.condicionales;
import java.util.Scanner;

public class Cuestionario {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int Resultados =0;
        int Preguntas = 0;
        int TotalResultados= 0;
        
        System.out.println("Numero de preguntas del test: ");
        Preguntas = Entrada.nextInt();
        System.out.println("Numero de resultados obtenidos: ");
        Resultados = Entrada.nextInt();
        
        TotalResultados = (Resultados*100/Preguntas);
        System.out.println("El Total de Resultados es: " + TotalResultados + "%");
        
        if(TotalResultados>=90){
            System.out.println("Nivel maximo");
            
        } else if(TotalResultados>=75 && TotalResultados<=90){
            System.out.println("Nivel medio");
            
        }else if(TotalResultados>=50 && TotalResultados<=75){
            System.out.println("Nivel regular");
            
        }else if(TotalResultados<50){
            System.out.println("Fuera de nivel, minimo");
            
        }else{
            System.out.println("No se puede calcular el nivel obtenido");
        }
        
    }
    
}
