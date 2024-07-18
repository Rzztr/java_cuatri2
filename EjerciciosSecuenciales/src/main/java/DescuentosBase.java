/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ricar
 */
public class DescuentosBase {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //Variable Sueldo Base   
        float SueldoBase = 0;
        
        //Cuentas de Descuento
        System.out.println("Sueldo base del empleado: ");
        SueldoBase= Entrada.nextFloat();
        double ValorRenta= (SueldoBase*0.1);
        System.out.println("ValorRenta = " + ValorRenta);
        var ValorAportes =(SueldoBase*0.07);
        System.out.println("ValorAportes = " + ValorAportes);
        var ValorSegSocial = (SueldoBase*0.075);
        System.out.println("ValorSegSocial = " + ValorSegSocial);
        var ValorDesc = (ValorRenta+ValorAportes+ValorSegSocial);
        System.out.println("ValorDesc = " + ValorDesc);
        //Impresion del sueldo
        var SueldoNeto = (SueldoBase-ValorDesc);
        System.out.println("El sueldo total a pagar: "+ SueldoNeto);        
        
    }
    
}
