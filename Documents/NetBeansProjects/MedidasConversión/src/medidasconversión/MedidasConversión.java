/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medidasconversión;
import java.util.Scanner;


/**
 *
 * @author Dellç
 */
public class MedidasConversión {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Dcelaración e inicialización de variables
        
        double M, cm, km, F, P;
        
        //Inicialización de variables
        
        M = 0; cm = 0; km = 0; F = 0; P = 0;
        
        System.out.println("***Programa que permite la conversión de medidas");
        System.out.println("");
        
        //Lectura de datos
        
        System.out.println("Ingrese el valor en metros");
        M = leer.nextDouble();
        
        System.out.println("Ingrese el valor de 1 centimetro");
        cm = leer.nextDouble( );
        
        System.out.println("Ingrese el valor de 1 kilómetro");
        km = leer.nextDouble( );
        
        System.out.println("Ingrese el valor de 1 pies");
        F = leer.nextDouble( );
        
        System.out.println("Ingrese el valor de 1 Pulgadas");
        P = leer.nextDouble( );
        
        //Proceso
        
        M = Math.pow(M,1);
        cm = (M / 100);
        km = (M / 1000);
        F = (M * 3.28);
        P = (M * 39.37);
        
         //Salida de datos
         
         System.out.println("La conversión de medidas M en metros es: " +M+ 
                 ", cm es igual a " +cm+ ", km igual a " +km+ 
                 ", F es igual a " +F+ " y P es igual a " +P );
                  
         
         
    }
    
}
