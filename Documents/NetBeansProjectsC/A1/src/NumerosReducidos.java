/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Lilibeth Puchaicela
 */
public class NumerosReducidos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaración
        int i=320;
        
        while (i>=160){
            System.out.println("Los números son " +i);  
            i -=20;
        }
    }
}
