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
public class VerificarPrimos {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //Declarar e inicializar variables:
        int num, i,j, n, divisor;
        num = 0; i = 0; j=0; n =0 ; divisor =0;
        //Crear ciclo para verificar los números primos
        
            System.out.println("Ingrese el número a verificar");
            num= leer.nextInt();
            
            for ( i = 1; i<=n;i++){
                
                if ((n% i)==0){
                    j++;
                }
            }
        if  (j <= 2){
                System.out.println(num + " No es primo");
                
        }
        else{
            System.out.println("Es primo" +num);
                 
        
        }
    }
}