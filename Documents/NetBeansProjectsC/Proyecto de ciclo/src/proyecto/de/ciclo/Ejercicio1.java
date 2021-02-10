/*
 * Leer n números enteros,almacenarlos en un vector y mostrar en pantalla todos los 
enteros comprendidos entre 1 y cada uno de los dígitos de cada uno de los números almacenados
en el vector.
 */
package proyecto.de.ciclo;

import java.util.Scanner;

/**
 *
 * @author Lilibeth Puchaicela
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//Declarar e inicialización de variables
        int n = 0;
        int digito = 0;
        int aux = 0;//Guarda el numero invertido

        //Ingresar limite de tamaño del vector
        System.out.println("Ingrese limite para el tamaño del vector");
        n = leer.nextInt();

        //Declarar Vector
        int[] A = new int[n];

        //Ingresar elementos  al vector
        System.out.println("ingrese los elementos del vector ");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor al vector  A [" + i + "]");
            A[i] = leer.nextInt();
        }

        //Presentar los elementos del vector
        System.out.println("Los elementos del vector son : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.println("");

// Verificar los digitos e imprimir cada digito con cada numero comprendido entre 1 y su digito
        

System.out.println("Los digitos de cada elemento del vector son : ");

        for (int i = 0; i < n; i++) {
            
            System.out.println("*** " + A[i] + "*** " + " : ");//Imprime el elemento del vector
            System.out.println("");
            
            int numero;//Captura el valor del vector
            
            numero = A[i];
            
            while (numero > 0) {
                
                int resto = numero % 10;
                aux = (aux * 10) + resto;
                numero /= 10;
            }
            
            A[i] = aux; //Vector recibe el valor del numero invertido
            
            do {
                
                digito = A[i] % 10;
                
                aux = 0;
                
                System.out.println("-- " + digito + " -- ");//Imprime el digito de los elementos del vector
                System.out.println(" ");
                
                for (int j = 1; j <= digito; j++) {//Imprime los numeros comprendidos entre 1 y su digito
                    System.out.print(j + ", ");
                }
                
                System.out.println("");
                
                A[i] = A[i] / 10;
            } while (A[i] != 0);
            
            System.out.println(" ");
        }
        System.out.println("Fin de programa");
    }
}
