package introj.ejercicio1introj;

import java.util.Scanner;

    /**
 *
 * @author Synti
 */
public class Ejercicio1IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = leer.nextInt();
        System.out.println("La suma de ambos numero es: "+(num1+num2));
        }
    }

