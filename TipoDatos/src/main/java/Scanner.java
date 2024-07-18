import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricar
 */
public class Scanner {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada= new Scanner(System.in);
        
        //variable
        int num = 0;
        var nombre = "Ricardo";
        
        //asignar variables
        System.out.println("Ingresa tu nombre: ");
        nombre = Entrada.nextLine();
        System.out.println("ingresa un numero: ");
        num = Entrada.nextInt();
                
        System.out.println("El primer numero que ingresaste es: " + num);
        System.out.println("Tu nombre es: "+nombre);
        
        /*
       double num1 = 0.25;
       double num2 = 0.25;
       
        System.out.println("Ingresa el primer numero: ");
        num1 = Entrada.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        num2=Entrada.nextDouble();
        System.out.println("La suma de los numeros es: " + (num1+num2));
        */
    }

}
   
