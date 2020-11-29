/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligono;
import java.util.Scanner;


/**
 *
 * @author Dellç
 */
public class AreaPoligono {
    
    /**
     * @param args the command line arguments
     * @param ar
     */
    public static void main(String[] args) {        

        
        Scanner leer = new Scanner(System.in);
                
        // Declaración e inicialización de variable
        double lc, at, A, B, D, ats, ar, area;
        
        // Inicialización de variables
        lc = 0; at = 0; A = 0; B = 0; D = 0; ats = 0; ar = 0; area = 0;
                   
      
        System.out.println("***Programa que permite el cálculo de area un poligono***");
        System.out.println("");
        
        //Lectura de datos
        
        System.out.println("Ingrese el lado del cuadrado");
        lc = leer.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo");
        at= leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        ar = leer.nextDouble();
        
        //Proceso
        A = Math.pow( lc, 2);
        B = ( lc +at) / 2;
        ats = B * 3;
        D = lc * ar;
        area = A + ats + D;
        
        //Salida de datos
        System.out.println("El area del poligono compuesto es:" +area+
                ", compuesto por un cuadrado de lado\n " +lc+ 
                ", un rectángulo de altura " +ar+ 
                "y una altura de triángulo" +at );
        
        
  }
    
}
