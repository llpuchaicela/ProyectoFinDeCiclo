package ciclofor;
import java.util.Scanner;
/**
 *
 * @author Lilibeth Puchaicela
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Programa con ciclo for");
        
        //Declaración de variables
        int num1= 0;
        int num2 = 1;
        int  n = 0;
        int fibo =0;
        int suma =0;
        int suma1 = 0;
        
        //Ingresar datos
        
        System.out.println("Ingrese el limite de la serie Fibonacci");
        n = leer.nextInt();
        System.out.println("\n");
   
        //Proceso ciclo for
         for( int i = 1; i <= n ; i++){
           
            if (i < 2){
                System.out.println(i + "," +num1);
                System.out.println(i+1 + "," +num2);
                suma = num1 + num2;
                i++;
            } 
            else{
                    
                fibo = num1 + num2;
                suma = suma + fibo;
                num1 = num2;
                num2 = fibo;
             
                 System.out.println(i + "," +fibo);
            }
        }
         
        System.out.println("\n PRIMERA SUMA: " +suma);
        System.out.println("\n Segunda soluciòn");
        
        num1 =0;
        num2 = 1;
        fibo = 0;
        for (int i=1; i<=n; i++){
             
            System.out.println(i + "," +num1);
             
            suma1 = suma1 + num1;
            fibo = num1 + num2;
            num1 = num2;
            num2= fibo;
            

        }
        System.out.println("\n SEGUNDA SUMA: " +suma1);

}
}
    
