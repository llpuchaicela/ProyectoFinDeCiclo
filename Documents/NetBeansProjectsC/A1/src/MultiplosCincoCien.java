
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dellç
 */
public class MultiplosCincoCien {
    public static void main(String[] args) {
        
            Scanner leer = new Scanner (System.in);
        //Declaración de variables
        int n=100;
        int multiplo =5;
        int i=0;
        //Ciclo
        for( i = 0; i<= n; i++){
            if (i % multiplo == 0){
                System.out.println(i);
            }
        }
        
        System.out.println("Generación de ciclo do while");
        
        //Declaraciòn e inicializaciòn de variables
        i = 0;
        do {
            if (i % multiplo==0){
                System.out.println(i);
            
            }
            i++;
        }
        while (i<= n);
        }    
    }

