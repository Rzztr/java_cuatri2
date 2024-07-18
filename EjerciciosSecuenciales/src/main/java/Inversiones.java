/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class Inversiones {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        //Declarar variables de inversion
        double Inversion1 = 0;
        double Inversion2 = 0;
        double Inversion3 = 0;
        
        //Introducir los datos
        System.out.println("Introduce la primer inversion: ");
        Inversion1 = Entrada.nextDouble();
        System.out.println("Introduce la segunda inversion: ");
        Inversion2 = Entrada.nextDouble();
        System.out.println("Introduce la tercera inversion: ");
        Inversion3 = Entrada.nextDouble();
        
        double InversionTotal = (Inversion1+Inversion2+Inversion3);
        System.out.println("La inversion total es de: " + InversionTotal);
        
        
        
        //Se hace el calculo y se muestran
        double PrimerProcentaje = (Inversion1/InversionTotal)*100;
        System.out.println("El porcentaje de la segunda inversion es de: " + PrimerProcentaje + "%");
        double SegundoPorcentaje = (Inversion2/InversionTotal)*100;
        System.out.println("El porcentaje de la segunda inversion es de: " + SegundoPorcentaje + "%");
        double TercerPorcentaje = (Inversion3/InversionTotal)*100;
        System.out.println("EL porcentaje de la segunda inversion es de: " + TercerPorcentaje + "%");
        
        
        
    }
    
}
