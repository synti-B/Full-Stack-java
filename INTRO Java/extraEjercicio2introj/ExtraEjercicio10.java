package introj.extraEjercicio2introj;

import java.util.Scanner;

/**
 *
 * @author Synti
 */
public class ExtraEjercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = (int) (Math.random() * 10 + 1);

        int numero2 = (int) (Math.random() * 10 + 1);

        int multi = numero1 * numero2;

        String opcion = " ";

        do {

           System.out.println("ingrese el numero a adivinar");
            int numero = sc.nextInt();

            if (numero == multi) {
                System.out.println("adivinaste");
                opcion = "S";

            } else {
                System.out.println("intenta de nuevo");
                System.out.println(multi);

            }
            System.out.println("para salir precione 'S'");
            opcion = sc.next().toUpperCase();
        } while (!"S".equals(opcion));

    }
}
