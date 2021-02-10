/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.de.ciclo;

import java.util.Scanner;

/**
 *
 * @author Lilibeth Puchaicela
 */
public class ProyectoDeCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Declarar e inicialización de variables
        int n = 0;
        int digito = 0;
        //Ingresar limite de tamaño del vector
        System.out.println("Ingrese limite para el tamaño del vector");
        n = leer.nextInt();
        
        //Declarar Vector
        
        int[] A = new int[n];
        
        //Ingresar datos al vector
        System.out.println("ingrese los elementos del vector ");

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor al vector  A [" + i + "]");
            A[i] = leer.nextInt();
        }
        
        //Presentar los elementos del vector
        System.out.println("Los elementos del vector son : ");
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);

        }
        System.out.println("");
        
// Verificar los digitos e imprimir cada digito con cada numero comprendido entre 1 y su digito

        System.out.println("Los digitos de cada elemento del vector son : ");

        for (int i = 0; i < n; i++) {

            System.out.println("***" + A[i] + "***" + " : ");//Imprime el elemento del vector

            System.out.println("");

            do {
                
                
                
                
                digito = A[i] % 10; //Verifica el digito del numero que se encuentra en el vector
                
                System.out.println(+digito + " : ");//Imprime el digito de los elementos del vector

                System.out.println(" ");

                for (int j = 1; j <= digito; j++) {//Imprime los numeros comprendidos entre 1 y su digito
                    
                    System.out.println(j + ", ");
                }
                System.out.println("");

                A[i] = A[i] / 10;
            } while (A[i] != 0);

            System.out.println(" ");
        
        }
            String num = leer.next();
        int number = Integer.parseInt(num);
        int[] digitos = new int[num.length()];
        int i = digitos.length - 1;
        while (number > 0) {
            //System.out.println( number % 10); //el residuo es tu número empezando por el último, osea en reversa, lo puedes ir guardando en un array de integers empezando por el último.
            digitos[i] = number % 10;
            number = number / 10;
            i--;
        }

        for (int j = 0; j < digitos.length; j++) {
            System.out.println(digitos[j]);
        }
    }
}    
    
