/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class ComisionBase {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //Variables
        double SueldoBase = 0;
        double Venta1 = 0;
        double Venta2 = 0;
        double Venta3 = 0;
        
        //Entrada del sueldo base
        System.out.println("Ingresa el sueldo base del empleado: ");
        var SueldoBase1 = Entrada.nextDouble();
        
        //entrda de las ventas
        System.out.println("Venta 1: ");
        Venta1 = Entrada.nextDouble();
        System.out.println("Venta 2: ");
        Venta2 = Entrada.nextDouble();
        System.out.println("Venta 3: ");
        Venta3 = Entrada.nextDouble();
        //Calculando las comisones
        double Comision1 = (Venta1*0.1);
        double Comision2 = (Venta2*0.1);
        double Comision3 = (Venta3*0.1);
        
        
        //Muestra de el sueldo total
        System.out.println("Al sueldo base se le sumaan el total de las comisiones...");
        var TotalComisiones = (Comision1+Comision2+Comision3);
        System.out.println("TotalComisiones = " + TotalComisiones);
        
        double TotalEmpleado = (TotalComisiones+SueldoBase1 );
        System.out.println("El sueldo total mas comisiones es de: "+ TotalEmpleado);  
    }
    
}
