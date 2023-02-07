
package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio3IntroJ {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase ");
        String frase= leer.nextLine();
        System.out.println("LA FRASE EN MAYUSCULA ES: "+frase.toUpperCase());
        System.out.println("La frase en minuscula es: "+frase.toLowerCase());
    }
    
}
