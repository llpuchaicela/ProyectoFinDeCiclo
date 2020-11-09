/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdatosjava1;

/**
 *
 * @author Dellç
 */
public class TiposDatosJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        System.out.println("Programa de tipos de datos operadores y expresiones java");   
        System.out.println("Introducción a la programción");
        System.out.println("Lilibeth Puchaicela");
        System.out.println("-----");
                
        //Tipos, operadores y expresiones - Enteros
        
        int nun1 =12;
        int nun2 =4;
        int nun3 = nun1 + nun2;
        System.out.println("El valor de la varibale entera nun3 es:" +nun3);
        
        //Tipos, operadores y expresiones - Decimal
        
        double dec1= 0.5;
        double dec2 = 10.55;
        double dec3 = dec1 * dec2;
        System.out.println("El valor de la variable decimal dec3 es=" +dec3);
        
        //Tipos, operadores y expresiones - Char
        System.out.println("-----");
        char letra1 = 'M';
        char letra2 = 'C';
        System.out.println("Los carácteres son:" +letra1 + letra2);
        
        //Tipos, operadores y expresiones - String
        System.out.println("-----");
        
        String nombre, apellido, domicilio, telefono;
        
        //inicializar los string
        nombre = "Lilibeth ";
        apellido = "Puchaicela";
        domicilio = "Loja";
        telefono = "0988636271";

        System.out.println("Mi nombre es: " +nombre);
        System.out.println("Mi apellido es: " +apellido);
        System.out.println("Mi número de teléfono es:" +telefono);
        System.out.println("\n");
        
        System.out.println("**Presentar en una sola linea**");
                
        System.out.println("Me llamo " +nombre+"" +apellido+ ", vivo en " +domicilio+ ", y mi teléfono de casa es " +telefono);
        
        System.out.println("Me llamo " +nombre+ "" +apellido+ 
                ", vivo en " +domicilio+ ", y el teléfono de casa es " +telefono+"\n");
        System.out.println("**Presentar contatenando variables de tipo string** \n");
           
                
        System.out.println("Me llamo " .concat (nombre).concat (apellido).concat(" y vivo en ").concat(domicilio).concat(" y mi teléfono es ").concat(telefono));
        

              
        
        
        
                
       
             
       
        
        
        
   
    }
    
}
