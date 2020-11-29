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
public class NúmeroPositivoNegativa {
    public static void main(String[] args) {
     
    Scanner leer = new Scanner(System.in);
    
    //Declaración e inicialización de variables.
    int Num;
    //Inicialización de variables
    Num =0;
    String tipo = "";//Valor que asigna si un número es positivo o negativo
    //Entrada de datos
    System.out.println("Ingrese un número");
    Num = leer.nextInt();
    //Proceso
    if (Num %2==0){
        tipo = "Positivo";
    }
    else{
        tipo = "Negativo";
      }    
        System.out.println("El número" +Num+ " es " +tipo );
    
}
}
