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
public class Potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //Declarar e inicializar las variables
        
        int num, pot, cont, res;
        num= 0; pot =0; cont = 1;res = 1;
        
        //Ingresar datos
        System.out.println("Ingrese la base de la potencia");
        num = leer.nextInt();
        System.out.println("Ingrese la potencia");
        pot = leer.nextInt();
        //ciclo repetitivo que obtiene la potencia de un número
        while (cont <= pot){
            res= res*num;
            cont=cont+1;
        }
        //Presentar resultado
        System.out.println("La potencia de " +num+" elevado a " +pot +" es" +res);
    }
}
