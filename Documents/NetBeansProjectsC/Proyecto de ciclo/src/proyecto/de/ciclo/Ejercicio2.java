/*
 * Leer dos matrices 4x6 enteras y
determinar si el promedio de las
“esquinas” de una matriz es igual al
promedio de las “esquinas” de la otra
matriz.
 */
package proyecto.de.ciclo;

import java.util.Scanner;

/**
 *
 * @author Lilibeth Puchaicela
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //Declaración e inicialización de variables 

        int n = 4;
        int m = 6;
        int sumaA = 0;
        int sumaB = 0;
        double promA = 0;
        double promB = 0;

        //Declaración e inicialización de la matriz 
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        //Llenar la matriz A
        System.out.println("Ingrese los valores de la matriz A ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = leer.nextInt();
            }
        }
        //Presentación de la matriz
        System.out.println("Matriz A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("\n");
        }

        //Llenar la matriz B
        System.out.println("Ingrese los valores de la matriz B ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = leer.nextInt();
            }
        }

        //Presentación de la matrizB
        System.out.println("Matriz B");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("\n");
        }

        //Suma y promedio de las esquinas de la matriz A
        sumaA = A[0][0] + A[3][0] + A[0][5] + A[3][5];
        promA = sumaA / 4;

        //Suma y promedio de las esquinas de la matriz B
        sumaB = B[0][0] + B[3][0] + B[0][5] + B[3][5];
        promB = sumaB / 4;

        //Presentación de sumas y promedios
        
        System.out.println("La suma de las esquinas  de la matriz A es : "
                + "" + sumaA + " y su promedio  es: " + promA);
        System.out.println("La suma de las esquinas de la matriz B es : "
                + "" + sumaB + " y su promedio  es: " + promB);
        
        //Verificar si los promedios de las esquinas son iguales.
        
        if (promA == promB) {
            System.out.println("El promedio de las esquinas de las matrices son iguales");
        } else {
            System.out.println("Sus promedios son diferentes ");
        }
        System.out.println(" FIN DEL PROGRANA");
    }
}
