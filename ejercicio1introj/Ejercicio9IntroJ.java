
package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio9IntroJ {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String frase= leer.nextLine();
        if(frase.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");}
    }
    
}
