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
public class FacturaCompra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Programa para calcular el total de una factura de venta");
         //Declaración e inicialización de Variables
        double Subtotal, Total, Descuento, Limite1 = 200, Limite2 = 500;
        //Ingrese las Variables
        System.out.println("---Factura de Venta---");
        System.out.println("Por compras mayores o iguales a 200$, se le aplicara "
                + "un descuento del 10%.");
        System.out.println("Por comprar mayores o iguales a 500$, se le aplicara "
                + "un descuento del 15%.");
        System.out.println("Ingrese el Subtotal de la Compra: ");
        Subtotal = leer.nextDouble();
        //Proceso
        if((Subtotal >= Limite1) && (Subtotal < Limite2)){
            Descuento = 0.10;
        }else{
            Descuento = 0.15;
        }
        Total = Subtotal - (Subtotal * Descuento);
        //Salida de datos
        System.out.println("El Total de su compra es: " + Total);
    }
}
    
