/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Dellç
 */
public class VerificarNum {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //Declarar e inicializar variables
        int cont, n, num, sumPar, sumImpar,sumNeg, sumPos;
        cont =1; n = 1; num = 0; sumPar = 0; sumImpar = 0; sumNeg = 0; sumPos = 0;
        //Ingreso de datos
        System.out.println("Ingrese el límite de nùmero a verificar");
        n = leer.nextInt();
        
        //Crear ciclo para verificar los números
        while (cont<=n){
            System.out.println("Ingrese el número a verificar");
            num = leer.nextInt();
            
            if (num % 2 == 0){// Verifica si un número es par o impar
                sumPar = sumPar + num; //suma los números pares
            }           
            else{ //Verifica si un número es Impar
                sumImpar = sumImpar + num; //suma los números impares
            }
            if (num > 0 ){
                sumPos = sumPos + num; // suma de números positivos
            }
            else{// Verifica si un número es negativo
                sumNeg= sumNeg + num; // suma los numeros negativos
            }
        cont = cont + 1;
        }
        
        //Salida de dato
        System.out.println("La suma de los pares es: " +sumPar);
        System.out.println("La suma de los impares es: " +sumImpar);
        System.out.println("La suma de los positivos es: " +sumPos);
        System.out.println("La suma de los negativos es: " +sumNeg);
        
    }
}
