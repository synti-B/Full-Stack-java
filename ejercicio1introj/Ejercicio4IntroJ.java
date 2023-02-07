
package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio4IntroJ {
  
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);   
        System.out.println("Ingrese el grado: ");
        double grado = leer.nextDouble();
        System.out.println("el grado ingresado es: "+grado+" su equivalente en fahrenheit es: "+(32+(9*grado/5)));
    }
    
}
