package introj.ejercicio1introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class Ejercicio13IntroJ {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension que desea que tenga el cuadrado");
        int dimension = leer.nextInt();
        for (int i = 0; i <= dimension - 1; i++) {
            for (int j = 0; j <= dimension - 1; j++) {
                if (i != 0 && i != dimension - 1 && j != 0 && j != dimension - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }

            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }

}
