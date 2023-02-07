package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio10IntroJ {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int suma=0;
         System.out.println("Ingrese un numero natural, que sera el valor limite");
         int numLimite = leer.nextInt();
         do{
             System.out.println("Ingrese un numero:");
             int num= leer.nextInt();
             suma=suma+num;
                         
         }while(suma<= numLimite);
         System.out.println("La suma es: " +suma);
    }
    
}
