
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class ConversionMoneda {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
//Declarar las primeras variables
        float PrecioDolar = 0;
        double Remesa = 0;
        
        //Introducir los datos
        System.out.println("Cantidad de  dinero que se va a enviar (Dolares): ");
        Remesa= Entrada.nextDouble();
        System.out.println("Precio del dolar de hoy: ");
        PrecioDolar = Entrada.nextFloat();
        
        //Muestra de resultados
        double Conversion = (PrecioDolar*Remesa);
        System.out.println("La cantidad enviada en pesos es: $"+Conversion);
        
        
        
        
        
        
    }
    
}
