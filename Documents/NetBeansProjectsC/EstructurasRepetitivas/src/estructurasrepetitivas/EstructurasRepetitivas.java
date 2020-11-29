/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasrepetitivas;
import java.util.Scanner;

/**
 *
 * @author Dellç
 */
public class EstructurasRepetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("***Programa que muestra los 10 primeros números  enteros***");
        //Declaración e inicialización de variables
        int i, n,suma;
        i = 1; n = 0; suma =0;
        
        System.out.println("Ingrese el limite de números  a presentar");
        n = leer.nextInt();
               
        while (i <= n){
            System.out.println(i);
            suma = suma + i;
            i = i + 1;
        }
        
        System.out.println("La suma de los números es: " +suma);
    }
}
        
  
    