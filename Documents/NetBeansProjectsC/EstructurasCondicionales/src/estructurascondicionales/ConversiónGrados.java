/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;

/**
 *it
 * @author Lilibeth
 */
public class ConversiónGrados {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Calcular Grados Celsius a Farenheit y a Kelvin
        double gc,gf,gk;
       
        System.out.println("---Convertidor de Grados Celsius---");
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        gc = leer.nextDouble();
        if(gc > 0){
            gf = (gc * 9/5) + 32;
            gk =  gc + 273.15;
            System.out.println("Los grados Celsius convertidos a grados Farenheit son: "
            + gf + " Â°F");
            System.out.println("Los grados Celsius convertidos a grados Kelvin son: "
            + gk + " K");
        }
    }
}
