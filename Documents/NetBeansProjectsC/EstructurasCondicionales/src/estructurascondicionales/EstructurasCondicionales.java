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
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    // Calcular si un número es par
        int N;
        System.out.println("---Calcular Si un Número es Par---");
        System.out.print("Ingrese un #: ");
        N = leer.nextInt();
        if(N%2==0){
            System.out.println("El Número "+N+" Es Par!");
    }
    
}
}
