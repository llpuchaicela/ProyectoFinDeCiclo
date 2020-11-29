/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;

/**
 *
 * @author Dellç
 */
public class CondicionalesMayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("***Programa para saber cual es el número mayor"+""
                + " de tres números condicional simple***");
        //Declaración e inicialización de variables
        int N1, N2, N3, R;
        //Inicialización de variables
        N1=0; N2=0;N3=0; R=0;
        //Ingreso de variables
        System.out.println("Ingrese tres números");
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        N3 = leer.nextInt();
        //Proceso
        if ((N1>N2)&&(N1>N3)){
             R= N1;
        }
        if ((N2>N1)&&(N2>N3)){
            R= N2;
        }
        if ((N3>N2)&&(N3>N1)){
            R=N3;
        }
        System.out.println("El número mayor es:" +R );
        
        System.out.println("***Programa para saber cual es el número mayor"+
                " de tres números condicional compuesta***");
        //Declaración e inicialización de variables
        N1=0; N2=0;N3=0; R=0;
        //Ingreso de variables
        System.out.println("Ingrese tres números");
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        N3 = leer.nextInt();
        //Proceso
        if ((N1>N2)&&(N1>N3)){
             R= N1;
        }else{
            System.out.println("");
        }
        if ((N2>N1)&&(N2>N3)){
            R= N2;
        }else{
            System.out.println("");
        }
        if ((N3>N2)&&(N3>N1)){
            R=N3;
        }else{
            System.out.println("");
        }
        System.out.println("El número mayor es:" +R );
        
         System.out.println("***Programa para saber cual es el número"+
                 " mayor de tres números condicional anidada***");
        //Declaración e inicialización de variables
        N1=0; N2=0;N3=0; R=0;
        //Ingreso de variables
        System.out.println("Ingrese tres números");
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        N3 = leer.nextInt();
        //Proceso
        if ((N1>N2)&&(N1>N3)){
             R= N1;
        }else{
            System.out.println("");
             if ((N2>N1)&&(N2>N3)){
                  R= N2;
             }else{
                 System.out.println("");
                   if ((N3>N2)&&(N3>N1)){
                        R=N3;
                    }else{
                       System.out.println("");
        }
    }
    
}
                System.out.println("El número mayor es:" +R );
    }
}  

