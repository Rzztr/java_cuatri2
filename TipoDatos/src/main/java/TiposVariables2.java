/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ricar
 */
public class TiposVariables2 {
    public static void main(String[] args) {
        //Definimos las variables que necesitamos
        int X =38;
        int Y =19;
        double N= 80;
        double M= 40;
        //Comenzamos con las operaciones
        System.out.println("La suma de la variable X y Y es: "+ (X+Y));
        System.out.println("La resta es igual a "+ (X-Y));
        System.out.println("El producto de X y Y es igual a: "+(X*Y));
        System.out.println("El cosiente es: "+(X/Y));
        System.out.println("El resto del cociente es: "+(X%Y));
        System.out.println("La suma de N y M"+(N+M));
        System.out.println("La resta de N y M es:" +(N-M));
        System.out.println("El producto de N y M es: "+(N*M));
        System.out.println("el cociente de N y M es: "+ (N/M));
        System.out.println("El residuo es: "+ (N%M));
        System.out.println("la suma de X y N es: "+(X+N));
        System.out.println("el cociente de Y y M es: "+ (Y/M));
        System.out.println("El resto de Y y M es: "+(Y%M));
        //Se define otra variable para evitar la saturacion de codigo
        var DobleVariables= (X*2)+(Y*2)+(N*2)+(M*2);
        System.out.println("el doble de cada variable es: "+DobleVariables);
        var SumaVariables = X+Y+N+M;
        System.out.println("La suma de variables es igua a: " + SumaVariables);
        double ProductoVariables = (X*Y*N*M);
        System.out.println(" El Producto de variables es: " + ProductoVariables);
     }
    
}
