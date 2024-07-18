/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        //Scanner
        Scanner Triangulo = new Scanner(System.in);
        
        //variables
        double Base = 0;
        double Altura= 0 ;
        
        //asiganr las variables
        System.out.println("Ingresa la base del triangulo: ");
        Base = Triangulo.nextDouble();
        System.out.println("Ingresa la altura del trinagulo: ");
        Altura = Triangulo.nextDouble();
        
        //operacion y salida de consola
        var AreaTriangulo = (Base*Altura/2);
        System.out.println("El area del tringulo es: " + AreaTriangulo);
    }
    
}
