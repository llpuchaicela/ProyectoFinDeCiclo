/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaparalelogramo;
import java.util.Scanner;

/**
 *
 * @author Dellç
 */
public class AreaParalelogramo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
              
        //Declaración e inicialización de variables
        double A, B, C, D, at, ar, areatotal;
        
        //Inicialización de variables.
        A = 0; B = 0; C = 0; D = 0; at = 0; ar = 0; areatotal = 0;
        
        System.out.println("*** Programa que permite el cálculo"
                + " del área del terreno");
        System.out.println("");
        
        //Lectura de datos
        
        System.out.println("Ingrese la altura del paralelogramo");
        A = leer.nextDouble();
       
        System.out.println("Ingrese el largo del rectángulo");
        B = leer.nextDouble();
        
        System.out.println("Ingresar la altura del rectángulo");
        C = leer.nextDouble();
        
        //Proceso
        D = Math.pow (A,C);
        at = (B*A) /2;
        ar = B * C;
        areatotal = at + ar;
        
        //Salida de Datos
        System.out.println("El area del terreno compuesto es:" +areatotal+
                ", compueesto por un rectángulo de largo" +A+
                ", un rectángulo de largo " +B+ 
                " y una altura de rectángulo" +C );
        
        //Declararación e inicialización de variables para costo de terreno
        System.out.println("Introduzca el costo del metro cuadrado: ");
        double metro = leer.nextInt();
        System.out.println("Introduzca el areatotal del paralelogramo: " );
        double  area = leer.nextInt();
       
             
        double resultado =(area*metro);
        
        System.out.println("El total a pagar por el terreno es: $ " +resultado);
    
        
        
        
        
                
 
    }
    
}
