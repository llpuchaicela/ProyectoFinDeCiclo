/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;
/**
 *
 * @author Lilibeth
 */
public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaración de variables
        int N;
        
         // Inicialización de variables
        N = 0;
        System.out.println("---Calcular si un Número es Par o Impar---");
        System.out.print("Ingrese un #: ");
        N = leer.nextInt();
        if(N%2==0){
        System.out.println("El Número "+N+" Es Par!");
        }else{
        System.out.println("El Nùmero "+N+" Es Impar!");
        }
    }
   
}

  
