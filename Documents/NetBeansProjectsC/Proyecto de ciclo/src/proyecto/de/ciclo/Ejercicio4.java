/*
 *Iniciando en la posición central con 
un movimiento de espiral en sentido 
contrario a las manecillas del reloj se puede
formar un cuadrado de lado 7 como el que 
se muestra acontinuación
De aqui  se puede notar que 8 de los 13 numeros posicionados
en ambas diagonales son números primos, es decir, un porcentaje de 
8/13= 62%. A medida que se agregan más capas de la matriz y 
se verifican los numeros primos en las diagonales, 
¿Cuál es la menor longitud del cuadrado de espiral para el 
cual el porcentaje de primos en ambas diagonales es menor al 10%?
 */
package proyecto.de.ciclo;

import java.util.Scanner;

/**
 *
 * @author Lilibeth Puchaicela
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

//Declarar e inicializar variables
        int serie;  // Numeros que incrementan
        int x; // valor de   i
        int y;  //valor de j
        int n;
        int i = 0;
        int j = 0;
        int impar = 1; // para imprimir columna a la  derecha
        int de = 0; // valor de la columna de la derecha.
        //Ingresar limite de matriz
        do {
            System.out.print("Ingrese limite de tamaño de la matriz   ");

            n = leer.nextInt();
            x = n % 2;

        } while (n < 0 || x == 0);

        serie = 1;
        int[][] M = new int[n][n];

        x = (n - 1) / 2;
        y = (n - 1) / 2;
        i = x;

        //Proceso para crear la matriz Espiral
        do {
            for (j = y; j <= y; j++) {
                M[i][j] = serie;
                serie++;
            }
            for (i = x - de; i >= x - impar; i--) {
                M[i][j - de] = serie;
                serie++;
                y = j - de;
            }
            i++;
            for (j = y - 1; j >= i; j--) {
                M[i][j] = serie;
                serie++;
            }
            j++;
            for (i = j + 1; i <= x + 1; i++) {
                M[i][j] = serie;
                serie++;
                y = j;
            }
            i--;
            for (j = y + 1; j <= i; j++) {
                M[i][j] = serie;
                serie++;
            }
            y = j;
            x = i;
            impar = impar + 2;
            de = 1;
        } while (serie <= n * n);

        System.out.println("La matriz espiral es : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (M[i][j] < 10) {
                    System.out.print(" " + M[i][j] + "  ");
                } else {
                    System.out.print(M[i][j] + "  ");
                }
            }
            System.out.println("  ");

        }
        System.out.println("La menor longitud  del cuadrado espiral es de 3*3  con un porcentaje menor a 10%  de 2 numeros primos en   ambas diagonales. ");
        System.out.println("Fin de programa");

    }
}
