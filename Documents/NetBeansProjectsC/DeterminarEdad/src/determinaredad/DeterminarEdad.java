/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package determinaredad;
import java.util.Scanner;

/**
 *
 * @author Lilibeth
 */
public class DeterminarEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);    

    // Declarar e inicializar las variables
    int añoNacimiento, mesNacimiento, diaNacimiento, añoActual, mesActual, diaActual;
    //Inicialización de variables
    int año = 0, mes=0 , dia =0;
    
    System.out.println("***Programa que permite determinar la edad de una persona***");
    //Ingresar datos de variables
    diaActual = 0;
    mesActual = 0;
    añoActual = 0;
    diaNacimiento = 0;
    mesNacimiento = 0;
    añoNacimiento = 0;
    System.out.println("Ingresas fecha actual, en dia, mes y año");
        diaActual = leer.nextInt();
        mesActual = leer.nextInt();
        añoActual = leer.nextInt();    
        System.out.println("Ingresar fecha de nacimiento en día, mes y año");
        diaNacimiento = leer.nextInt();
        mesNacimiento = leer.nextInt();
        añoNacimiento = leer.nextInt();
    //Condición para determinar la edad 
    año = añoActual - añoNacimiento;
    if (añoNacimiento <= añoActual){
        if (añoNacimiento== añoActual){
            if (añoNacimiento < añoActual){
                año=año-1;               
            }          
        }   
    }
    if (mesNacimiento>= mesActual){
        if (mesNacimiento == mesActual){
            mes=0;                      
        }else{
            mes = 12-(mesNacimiento-mesActual);           
        } 
    }else{
        mes = mesActual-mesNacimiento;
    }
    if (diaNacimiento>= diaActual){
        if (diaNacimiento == diaActual){
            dia=0;                      
        }else{
            dia = 30-(diaNacimiento-diaActual);           
        } 
    }else{
        dia = diaActual-diaNacimiento;
    }
        System.out.println("Tu has vivido " +año+ " años, " +mes+  " meses y " +dia+ " dias cumplidos");
    }
}
