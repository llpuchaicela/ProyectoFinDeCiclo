/*
 * Construir una función que reciba como
parámetro un vector de 10 posiciones
enteras y un dígito, y que retorne la
cantidad de números del vector en
donde dicho dígito está de penúltimo
 */
package proyecto.de.ciclo;

import java.util.Scanner;

/**
 *
 * @author Lilibeth Puchaicela
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Declarar  e inicializar  variables
        int  ingresarDigito, SonIguales;

        //Declarar vector 
        int[] M = DefinirTamano();
        Imprimir(M);

        ingresarDigito = IngresarDigito();
        System.out.println("El numero a buscar como penultimo en cada vector es " + ingresarDigito + "\n");

        SonIguales = respuesta(M, ingresarDigito);

        System.out.println("La cantidad de números del vector en donde dicho dígito está de penúltimo es : " + SonIguales);

    }

    //Función para ingresar elementos al  vector
    public static int[] DefinirTamano() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los elementos del vector");
        int[] M = new int[10];
     
        for (int i = 0; i < 10; i++) {
            System.out.print("M[" + i + "]= ");
            M[i] = leer.nextInt();
        }
        System.out.println();
        return M;
    }

    //Función para imprimir los vectores
    public static void Imprimir(int M[]) {
        for (int i = 0; i < 10; i++) {
            System.out.print(M[i] + "  ");
        }
        System.out.println("  ");

    }

    //Función para ingresar digito a buscar
    public static int IngresarDigito() {
        Scanner leer = new Scanner(System.in);

        int dig = 0;

        System.out.println("Ingrese el digito que desea buscar");
        dig = leer.nextInt();

        return dig;
    }

    //Función para verificar el penultimo digito de los elementos del vector
    public static int respuesta(int M[], int dig) {
        int aux[] = new int[M.length];
        int conta = 0;

        for (int i = 0; i < M.length; i++) {
            if (M[i] > 100 && M[i] < 1000000000) {

                aux[i] = M[i] / 10;
            }
            if ((aux[i] % 10) == dig) {
                conta++;
                System.out.print(M[i] + ", ");
            }
        }
        System.out.println();

        return conta;
    }

}
